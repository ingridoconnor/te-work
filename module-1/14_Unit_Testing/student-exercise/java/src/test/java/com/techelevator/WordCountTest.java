package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	WordCount counts = new WordCount();
	
	@Test
	public void ba_ba_black_sheep_test() {
		Map<String, Integer> output = new HashMap<>();
		output.put("ba", 2);
		output.put("black", 1);
		output.put("sheep", 1);
		String[] myArray = {"ba", "ba", "black" ,"sheep"};
		assertEquals(output, counts.getCount(myArray));
		
	
	}
	@Test
	public void abc_test() {
		Map<String, Integer> output = new HashMap<>();
		output.put("a", 2);
		output.put("b", 2);
		output.put("c", 1);
		String[] myArray = {"a", "b", "a" , "c", "b"};
		assertEquals(output, counts.getCount(myArray));
		
	
	}
	@Test
	public void abc_second_test() {
		Map<String, Integer> output = new HashMap<>();
		output.put("a", 3);
		output.put("b", 1);
		output.put("c", 1);
		String[] myArray = {"a", "a", "a" , "c", "b"};
		assertEquals(output, counts.getCount(myArray));
		
	
	}
	

	

}
