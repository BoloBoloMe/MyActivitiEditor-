package com.bolo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // SpringBoot启动类
@ComponentScan("com.bolo.test")
public class Start {
    private static Logger log = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new SpringApplicationBuilder()
                .sources(Start.class)
                .run(args);
        log.info("-----------finished-----------");
    }
}
