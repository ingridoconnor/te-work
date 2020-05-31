package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {
	Less20 not20 = new Less20();
	
	
	@Test
	public void one_less_than_mult_20() {
		assertTrue(not20.isLessThanMultipleOf20(18));
		assertFalse(not20.isLessThanMultipleOf20(20));
		assertTrue(not20.isLessThanMultipleOf20(19));
		
		
	}

	

}
