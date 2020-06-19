package com.org.spring;

import com.org.spring.app.AppConfig;
import com.org.spring.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// 初始化 spring 上下文
		AnnotationConfigApplicationContext  ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(CityService.class));
	}

}
