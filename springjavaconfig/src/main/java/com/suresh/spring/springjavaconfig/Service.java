package com.suresh.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	private Dao dao;

	public void init() {
		System.out.println("init().");
	}

	public void destroy() {
		System.out.println("destroy().");
	}

	public void save() {
		dao.create();
	}
}
