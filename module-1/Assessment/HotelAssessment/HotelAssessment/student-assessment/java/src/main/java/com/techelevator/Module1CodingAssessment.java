package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Module1CodingAssessment {
	public static void main(String[] args) throws FileNotFoundException {
		HotelAssessment hotel = new HotelAssessment ("ingy", 2);
		Scanner scanner = new Scanner (new File ("data-files/HotelInput.csv"));
		
		
		ArrayList<HotelAssessment> list = new ArrayList<HotelAssessment>();
		double reservationTotalForAll;
		while(scanner.hasNextLine()) {
			String lineInput = scanner.nextLine();
			String[] array = lineInput.split(",");
			HotelAssessment myRes = new HotelAssessment((array[0]), Integer.parseInt(array[1]));
			list.add(myRes);
			reservationTotalForAll = (Integer.parseInt(array[1]) * 59.99);
			
			
			System.out.println(reservationTotalForAll);
			System.out.println(myRes + "hi");
		}
		
	} 

}
