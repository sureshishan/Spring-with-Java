package com.suresh.spring.springjavaconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suresh.spring.springjavaconfig.Service;
import com.suresh.spring.springjavaconfig.SpringConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfig.class);
		Service service = context.getBean(Service.class);
		Service service2 = context.getBean(Service.class);
		service.save();
		service2.save();
		
		System.out.println(service.hashCode());
		System.out.println(service2.hashCode());
		
		context.close();
	}
}
