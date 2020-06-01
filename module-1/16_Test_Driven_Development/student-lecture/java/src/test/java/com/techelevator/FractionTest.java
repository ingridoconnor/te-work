package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testEquals() {
		assertEquals(new Fraction(1, 2), new Fraction(1, 2));
	}
	
	
	
	
	@Test
	public void testNotEquals() {
		assertNotEquals(new Fraction(1,2), new Fraction (1,3));
	}
	
	@Test
	public void testEqFracNotReduced() {
		assertEquals(new Fraction(1, 2), new Fraction(2,4));
	}
	@Test
	public void testMultiply() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		Fraction expected = new Fraction (3, 8);
		assertEquals(expected, f1.multiply(f2));
	}
	@Test
	public void testAddTwoFracOfSameDen() {
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction (3, 4);
		Fraction expected = new Fraction(6, 4);
		assertEquals(expected, f1.add(f2));
	}
	@Test
	public void testAddTwoFracOfDiffDem() {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(5,6);
		Fraction expected = new Fraction (19, 12);
		assertEquals(expected, f1.add(f2));
	}

}
