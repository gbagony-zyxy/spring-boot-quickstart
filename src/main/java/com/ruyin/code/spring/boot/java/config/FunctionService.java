package com.ruyin.code.spring.boot.java.config;

/**
 * Created by ruyin on 2017/3/15.
 *
 * 定义功能类
 */
public class FunctionService {

    private FunctionBean functionBean;

    public FunctionService() {
    }

    public void sayHello(String text){
        System.out.println(functionBean.sayHello(text));
    }

    public FunctionBean getFunctionBean() {
        return functionBean;
    }

    public void setFunctionBean(FunctionBean functionBean) {
        this.functionBean = functionBean;
    }
}
