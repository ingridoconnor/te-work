package com.techelevator;

import static org.junit.Assert.assertEquals;

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
		List<Integer> primeFactorList = new ArrayList<>(3);
		assertEquals(primeFactorList, kata.factorize(3));
		
	}
	




}
