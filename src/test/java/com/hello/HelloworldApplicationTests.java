package com.hello;

import com.hello.entity.UserEntity;
import com.hello.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class HelloworldApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

        String url = encryptor.encrypt("jdbc:mysql://localhost:3306/sharekit?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");

        String root = encryptor.encrypt("root");

        String password = encryptor.encrypt("123456");

        System.out.println("url = " + url);
        System.out.println("root = " + root);
        System.out.println("password = " + password);

        Assert.assertTrue(url.length() > 0);
        Assert.assertTrue(root.length() > 0);
        Assert.assertTrue(password.length() > 0);

        String decrypt = encryptor.decrypt(root);
        String decyptyPassword = encryptor.decrypt(password);

        System.out.println("decrypt = " + decrypt);

        System.out.println("decyptyPassword = " + decyptyPassword);

    }

    @Test
    void getData() {
        List<UserEntity> userList = userService.getAll();
        for (UserEntity u : userList) {
            System.out.println(u.getId() + " --- " + u.getUsername() + " --- " + u.getAge());
        }
    }


    @Test
    public void logTest() {
        log.debug("身份证：{}，姓名：{}，电话：{}", "12414141412412412", "九歌笑笑不语", "18274339284");
    }

}
