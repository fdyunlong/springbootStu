package com.study;

import com.study.base.servlet.MyServlet1;
import com.study.config.datasource.DynamicDataSourceRegister;
import com.study.pojo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  //返回json字符串的数据，直接可以编写RESTFul的接口
@ServletComponentScan//这个就是扫描相应的Servlet包;
//@ComponentScan(basePackages={"cn.kfit","org.kfit","com.kfit"})
@Import({DynamicDataSourceRegister.class})
public class StuApplication {

	@RequestMapping("/")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(10);
		demo.setName("heollo");
		return demo;
	}



	public static void main(String[] args) {
		SpringApplication.run(StuApplication.class, args);
	}
}
