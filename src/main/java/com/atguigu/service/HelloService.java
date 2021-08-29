package com.atguigu.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/8/29 19:35
 */
@Service
public class HelloService {

    public String sayHello(String name){
        return "Hello "+name;
    }
}
