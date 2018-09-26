package com.emc.test;

import com.emc.dto.Event;
import com.emc.dto.Organizer;
import com.emc.manager.EventManager;
import com.emc.manager.impl.EventManagerImpl2;
import com.emc.manager.impl.EvnetManagerImpl;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();

		organizer.setId(new Long(1234l));
		organizer.setName("Apple Inc.");

		System.out.println(organizer);

		Event event = new Event(new Long(12345l), "IPhone 100 Luanch",
				"Grand Luanch");
		System.out.println(event.getDescription());

		EventManager em = new EvnetManagerImpl();
		System.out.println(em.create(new Long(123456l)).getId());

		EventManager em2 = new EventManagerImpl2();
		System.out.println(em2.create(new Long(456l)).getId());
	}
}
