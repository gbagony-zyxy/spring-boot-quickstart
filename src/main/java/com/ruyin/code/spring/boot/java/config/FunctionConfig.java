package com.ruyin.code.spring.boot.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ruyin on 2017/3/15.
 *
 * 配置类
 */
@Configuration
public class FunctionConfig {

    @Bean
    public FunctionBean functionBean(){
        return new FunctionBean();
    }

    @Bean
    public FunctionService functionService(){
        FunctionService functionService = new FunctionService();
        functionService.setFunctionBean(functionBean());
        return functionService;
    }
}
