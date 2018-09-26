package com.suresh.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.spring.springorm.passenger.dao.PassengerDao;
import com.suresh.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/suresh/spring/springorm/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) context.getBean("passengerDao");
		/*
		 * Passenger passenger = new Passenger(); passenger.setId(1);
		 * passenger.setFirstName("SureshChalamaiah");
		 * passenger.setLastName("Bethala");
		 */
		// dao.create(passenger);
		// dao.update(passenger);
		// dao.delete(passenger);

		// Passenger passenger = dao.find(1);
		context.registerShutdownHook();
		
		List<Passenger> passengers = dao.findAll();
		System.out.println(passengers);
	}
}
