package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Module1CodingAssessment {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner scanner = new Scanner(new File ("data-files/CarInput.csv"));
		int yearTotal = 0;
		
		ArrayList<CarClass> list = new ArrayList<CarClass>();
		while (scanner.hasNextLine()){
			String lineInput = scanner.nextLine();
			String[] array = lineInput.split(",");
			boolean isWhatever = false;
			if(array[2].contentEquals("true")) {
				isWhatever = true;
			}
			CarClass car = new CarClass (Integer.parseInt(array[0]), array[1], isWhatever);
		    yearTotal += 2020 - Integer.parseInt(array[0]);
		    
		    
		}
		

		System.out.println(yearTotal);
		

	}

	

}
