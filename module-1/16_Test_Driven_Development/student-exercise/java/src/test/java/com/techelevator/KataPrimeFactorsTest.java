package com.techelevator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataPrimeFactorsTest {
	KataPrimeFactors kata = new KataPrimeFactors();
	@Test
	public void accepts_number_1() {
		List<Integer> primeFactorList = new ArrayList<>();
		assertEquals(primeFactorList, kata.factorize(1));
		
	}
	
	@Test
	public void accepts_num_3() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(3);
		assertEquals(primeFactorList, kata.factorize(3));
		
	}
	@Test
	public void accepts_4_returns_2_2() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(2);
		primeFactorList.add(2);
		assertEquals(primeFactorList, kata.factorize(4));
		
	}
	@Test
	public void accepts_6_returns_2_3() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(2);
		primeFactorList.add(3);
		assertEquals(primeFactorList, kata.factorize(6));
		
	}
	@Test
	public void accepts_7_returns_7() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(7);
		assertEquals(primeFactorList, kata.factorize(7));
		
	}
	@Test
	public void accepts_8_returns_2_2_2() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(2);
		primeFactorList.add(2);
		primeFactorList.add(2);
		assertEquals(primeFactorList, kata.factorize(8));
		
	}
	@Test  
	public void accepts_9_returns_3_3() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(3);
		primeFactorList.add(3);
		assertEquals(primeFactorList, kata.factorize(9));
	}
	@Test
	public void accepts_10_returns_2_5() {
		List<Integer> primeFactorList = new ArrayList<>();
		primeFactorList.add(2);
		primeFactorList.add(5);
		assertEquals(primeFactorList, kata.factorize(10));
	}
	
	




}
