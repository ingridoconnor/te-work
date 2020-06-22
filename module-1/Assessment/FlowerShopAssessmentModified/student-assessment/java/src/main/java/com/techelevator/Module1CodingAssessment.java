package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {
		
		FlowerShopOrder flower = new FlowerShopOrder ("wedding", 1);
		
		// print out your object
		System.out.println(flower);
		
		Scanner scanner = new Scanner (new File ("data-files/FlowerInput.csv"));
		
		ArrayList<FlowerShopOrder> list = new ArrayList<FlowerShopOrder>();
		double orderSubtotal = 0;
		while (scanner.hasNextLine()){
			String lineInput = scanner.nextLine();
			String[] array = lineInput.split(",");
			FlowerShopOrder myFlower = new FlowerShopOrder ((array[0]), Integer.parseInt(array[1]));
			list.add(myFlower);
			
//			orderSubtotal = 19.99 + (Integer.parseInt(array[1]) * 2.99);
			
			// use the method you wrote to get the Subtotal and add to orderSubtotal
			orderSubtotal = orderSubtotal + myFlower.getSubtotal();
			System.out.println(myFlower);
	}

		
		System.out.println(orderSubtotal);
}
}
