package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTest {

	@Test
	public void getHerd_send_in_giraffe_return_Tower() {
		AnimalGroupName group = new AnimalGroupName();
		String expected = "Tower";
		String actual = group.getHerd("giraffe");
		
		assertEquals(expected, actual);
		// assertEquals("Tower", group.getHerd("giraffe"));
		
	}

}
