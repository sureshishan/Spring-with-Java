package com.suresh.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.spring.springorm.product.dao.ProductDao;
import com.suresh.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/suresh/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) context.getBean("productDao");
		/*
		 * Product product = new Product(); product.setId(1);
		 * product.setName("IPhone"); product.setDesc("It's Awesome");
		 * product.setPrice(800); dao.create(product); dao.update(product);
		 * dao.delete(product);
		 */
		// Product product = dao.find(1);
		List<Product> products = dao.findAll();
		System.out.println(products);

	}

}
