package com.hello.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.hello.antation.SentiAntation;

import java.io.IOException;
import java.util.Objects;
/**
 * 序列化注解自定义实现
 * JsonSerializer<String>：指定String 类型，serialize()方法用于将修改后的数据载入
 */
public class PassJsonSerializer extends JsonSerializer<String> implements ContextualSerializer {

    private JiugeStrategy jiugeStrategy;

    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(jiugeStrategy.getDesenitizer().apply(s));
    }
    /**
     * 获取属性上的注解属性
     */
    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        SentiAntation sentiAntation = beanProperty.getAnnotation(SentiAntation.class);
        if (Objects.nonNull(sentiAntation) && Objects.equals(String.class, beanProperty.getType().getRawClass())) {
            this.jiugeStrategy = sentiAntation.strategy();
            return this;
        }
        return serializerProvider.findValueSerializer(beanProperty.getType(), beanProperty);
    }
}
