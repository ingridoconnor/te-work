package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CigarPartyTest {
	CigarParty party = new CigarParty();
	
	@Test
	public void successful_cigars_in_range_for_party_weekend() {
		assertFalse(party.haveParty(30, true));
		assertTrue(party.haveParty(70, true));
		
	}
//	@Test 
//	public void no_party_womp_womp() {
//		assertFalse(party.haveParty(20, false));
//		assertTrue(party.haveParty(100, true));
//	}
	
	@Test
	public void not_successful_cigars_not_in_range_not_weekend() {
		assertTrue(party.haveParty(50, false));
		assertFalse(party.haveParty(100, false));
	}
	
	

	
}
