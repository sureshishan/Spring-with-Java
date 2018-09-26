package com.suresh.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ServiceConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public Service service() {
		return new Service();
	}
}
