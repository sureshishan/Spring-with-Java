package com.emc.manager.impl;

import com.emc.dto.Event;
import com.emc.manager.EventManager;

public class EventManagerImpl2 implements EventManager {

	public Event create(Long id) {
		return new Event(id, "IPhone 100 Luanch", "IPhone 100 Grand Luanch");
	}

}
