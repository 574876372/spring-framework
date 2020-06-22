package com.org.spring;

import com.org.spring.app.AppConfig;
import com.org.spring.service.CityService;
import com.org.spring.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// 初始化 spring 上下文
		AnnotationConfigApplicationContext  ac = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService o1 =(OrderService) ac.getBean("orderService");
		OrderService o2 =(OrderService) ac.getBean("orderService");
		System.out.println(o1==o2);
	}

}
