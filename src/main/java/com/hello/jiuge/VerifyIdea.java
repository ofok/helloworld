package com.hello.jiuge;

import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class VerifyIdea implements Serializable, InitializingBean {
    private transient String passwd;

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
