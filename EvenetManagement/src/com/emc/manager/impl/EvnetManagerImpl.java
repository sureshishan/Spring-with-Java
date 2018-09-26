package com.emc.manager.impl;

import com.emc.dto.Event;
import com.emc.manager.EventManager;

public class EvnetManagerImpl implements EventManager {

	public Event create(Long id) {
		Event event = new Event(id, null, null);
		return event;
	}

}
