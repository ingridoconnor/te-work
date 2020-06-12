package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Module1CodingAssessment {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		CarClass myCar = new CarClass(2003, "ford focus", false);
		
	
		Scanner scanner = new Scanner(new File ("data-files/CarInput.csv"));
		int yearTotal = 0;
		//System.out.println(scanner);
		ArrayList<CarClass> list = new ArrayList<CarClass>();
		while (scanner.hasNextLine()){
			String lineInput = scanner.nextLine();
			String[] array = lineInput.split(",");
//			boolean isWhatever = false;
//			if(array[2].contentEquals("true")) {
//				isWhatever = true;
//			}
			CarClass car = new CarClass (Integer.parseInt(array[0]), array[1], Boolean.parseBoolean(array[2]));
		    list.add(car);
			yearTotal += 2020 - Integer.parseInt(array[0]);
		    System.out.println(car);
		    
		}
		

		System.out.println(yearTotal);
		

	}

	

}
