package com.ruyin.code.spring.boot.java.config;

/**
 * Created by ruyin on 2017/3/15.
 *
 * 定义bean
 */
public class FunctionBean {

    private String beanClass;
    private String beanPath;


    public FunctionBean() {
    }

    public FunctionBean(String beanClass, String beanPath) {
        this.beanClass = beanClass;
        this.beanPath = beanPath;
    }

    public String sayHello(String text){
        return "Hello " + text;
    }
}
