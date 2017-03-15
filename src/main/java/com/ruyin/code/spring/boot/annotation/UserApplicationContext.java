package com.ruyin.code.spring.boot.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ruyin on 2017/3/15.
 *
 * 基于注解配置的spring
 */
public class UserApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        UserApplicationService service = context.getBean(UserApplicationService.class);
        service.sayHello("Spring boot!");

        context.close();
    }
}
