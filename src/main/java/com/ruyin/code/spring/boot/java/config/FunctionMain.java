package com.ruyin.code.spring.boot.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ruyin on 2017/3/15.
 */
public class FunctionMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);

        FunctionService service = context.getBean(FunctionService.class);
        service.sayHello("Hadoop!");

        context.close();
    }
}
