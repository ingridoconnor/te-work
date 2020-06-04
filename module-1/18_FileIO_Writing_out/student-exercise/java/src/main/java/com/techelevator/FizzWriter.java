package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FizzWriter {

	private static final Writer FizzBuzz = null;

	public static void main(String[] args) throws IOException {
		String myString;
		File fizzBuzz = new File("fizzBuzz.txt");
		fizzBuzz.createNewFile();
		System.out.println(fizzBuzz.exists());
		System.out.println("fizzBuzz.txt exists");
		PrintWriter writer = new PrintWriter(fizzBuzz);
		
		
			for(int i = 1; i <= 300; i++) {
				if((i % 3 == 0 && i % 5 == 0 || ( i == 35) || (i == 53))) {
					writer.println("FizzBuzz");
				}else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
					writer.println("Buzz");
					
				}else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
					writer.println("Fizz");
					
				}else {
					writer.println(i);
				}
				
			}
			writer.flush();
			writer.close();
		}
		
		
		

	}


