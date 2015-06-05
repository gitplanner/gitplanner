package com.example.gitplanner.eventlog;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import eventlog.EventId;

public class EventIdTest {
	
	@Test
	public void testEqualsHashCode() {
		
		EventId id1 = new EventId(UUID.randomUUID());
		EventId id2  = new EventId(id1.uuid);
	
		assertFalse(id1.equals(null));
		assertFalse(id1.equals("aaa"));
		assertTrue(id1.equals(id2));
		assertTrue(id1.equals(id1));
		assertTrue(id1.hashCode() == id2.hashCode());
		
	}
	
	@Test
	public void testStringConstructor() {
		
		EventId id1 = new EventId(UUID.randomUUID());
		EventId id2  = new EventId(id1.uuid.toString());
	
		assertTrue(id1.equals(id2));
		assertTrue(id1.hashCode() == id2.hashCode());
		
	}

	

}
