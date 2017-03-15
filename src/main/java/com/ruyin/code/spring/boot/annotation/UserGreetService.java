package com.ruyin.code.spring.boot.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by ruyin on 2017/3/15.
 */
@Service
public class UserGreetService {

    public String sayHello(String word){
        return "Hello " + word;
    }
}
