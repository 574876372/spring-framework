package com.org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		annotationConfigApplicationContext.register(Persion.class);

		Persion perison = (Persion) annotationConfigApplicationContext.getBean("persion");
		perison.sayWorld("ni hao wo shi chenlei ");

	}

}
