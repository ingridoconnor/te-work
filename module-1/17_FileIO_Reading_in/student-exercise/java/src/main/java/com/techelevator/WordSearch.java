package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		
		File inputFile = getInputFileFromUser("alices_adventures_in_wonderland.txt");
		Scanner userInput2 = new Scanner(System.in);
		System.out.print("Please enter word >>> ");
		String word = userInput2.nextLine();
		
		
		if(inputFile.exists())
			System.out.println("File exists");
		try(Scanner fileScanner = new Scanner(inputFile)) { //try with resources (resource) --auto close resource when done
			while(fileScanner.hasNextLine()) {
				String lineInput = fileScanner.nextLine();
				
				
				
				
				
					
				
			
				}
			}
		}
	
	private static File getInputFileFromUser(String string) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
	
		
		
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		
		
		
		
		
		
		
		
		//userInput.close();
		return inputFile;
	}
	


}

		

		
		


	

