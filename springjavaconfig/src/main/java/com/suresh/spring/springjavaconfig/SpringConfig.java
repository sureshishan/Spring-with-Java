package com.suresh.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class SpringConfig {
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
