package com.hello.jiuge;

import org.openjdk.jol.info.ClassLayout;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author jiuge
 */
public class HelloJiuge {
    public static void main(String[] args) {
        System.out.println("hello c");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.atZone(ZoneId.of("Asia/Shanghai")));

        System.out.println(ClassLayout.parseInstance(HelloJiuge.class).toPrintable());
    }
}
