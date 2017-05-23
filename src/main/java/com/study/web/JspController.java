package com.study.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/23.
 */

@RequestMapping("/jsp")
@Controller
public class JspController {

    @Value("${application.hello:Hello Angel}")
    public  String hello;

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello=" + hello);
        map.put("hello", hello);
        return "helloJsp";
    }
}
