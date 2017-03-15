package com.ruyin.code.spring.boot.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ruyin on 2017/3/15.
 */
@Service
public class UserApplicationService {

    @Autowired
    private UserGreetService userGreetService;

    public void sayHello(String word){
        System.out.println(userGreetService.sayHello(word));
    }
}
