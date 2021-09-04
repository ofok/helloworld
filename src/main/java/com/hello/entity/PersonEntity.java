package com.hello.entity;

import com.hello.antation.SentiAntation;
import com.hello.config.JiugeStrategy;
import lombok.Data;

@Data
public class PersonEntity {
    /**
     * 姓名
     */
    @SentiAntation(strategy = JiugeStrategy.USERNAME)
    private String userName;
    /**
     * 身份证号
     */
    @SentiAntation(strategy = JiugeStrategy.ID_CARD)
    private String idcard;
    /**
     * 地址
     */
    @SentiAntation(strategy = JiugeStrategy.ADDRESS)
    private String address;
    /**
     * 手机号码
     */
    @SentiAntation(strategy = JiugeStrategy.PHONE)
    private String mobilePhone;
}
