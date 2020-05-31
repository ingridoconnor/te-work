package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTest {
	AnimalGroupName group = new AnimalGroupName();
	@Test
	public void getHeard_Giraffe_returns_tower() {
		
		String expected = "Tower";
		String actual = group.getHerd("giraffe");
		
		assertEquals(expected, actual);
	}
	@Test
	public void elephant_returns_herd() {
		
		String expected = "Herd";
		String actual = group.getHerd("elephant");
		assertEquals(expected, actual);
		
	}
	@Test
	public void eLephanT_returns_herd() {
		
		String expected = "Herd";
		String actual = group.getHerd("eLephanT");
		assertEquals(expected, actual);
		
	}
	@Test
	public void octopus_returns_unknown() {
		String expected = "unknown";
		String actual = group.getHerd("octopus");
		assertEquals(expected, actual);
	}
	@Test
	public void crow_returns_murder() {
		String expected = "Murder";
		String actual = group.getHerd("crow");
		assertEquals(expected, actual);
	}
	

	
	
	

}
	