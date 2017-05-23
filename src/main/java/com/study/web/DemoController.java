package com.study.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/23.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
