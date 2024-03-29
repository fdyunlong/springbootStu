package com.study.base.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *在项目服务启动的时候就去加载一些数据或做一些事情这样的需求
 * @author   Angel(QQ:)
 * Spring Boot应用程序在启动后，会遍历CommandLineRunner接口的实例并运行它们的run方法。也可以利用@Order注解（或者实现Order接口）来规定所有CommandLineRunner实例的运行顺序。value值从小到大顺序。
 */
@Component
@Order(value=1)
public class MyStartupRunner1  implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>service starts execution, executes the load data, and so on<<<<<<<<<<<<<");
    }
}
