package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException  {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the path of file or dir: ");
		String path = userInput.nextLine();

		File file = new File(path);
		// file class lets us inspect various attribute of a file system obj

		if (file.exists()) {
			// find out info on file

			System.out.println("name: " + file.getName());
			System.out.println("AbsoulePath: " + file.getAbsolutePath());
			if (file.isDirectory()) {
				System.out.println("Type: directory");

			} else if (file.isFile()) {
				System.out.println("Type: file");
			}
		System.out.println("Size " + file.length());

	}else {
		System.out.println(file.getAbsolutePath() + "does not exisit");
	}
		System.out.println();
		System.out.println("Create new dir");
		System.out.println("Enter path of new dir");
		path = userInput.nextLine().trim();
		
		File newDirectory = new File(path);
		if(newDirectory.exists()) {
			System.out.println("Dir " + newDirectory.getAbsolutePath() + "already exists");
			System.exit(1);
			
		}else {
			if(newDirectory.mkdir()) {
				System.out.println("dir create at " + newDirectory.getAbsolutePath());
			}else {
				System.out.println("Could not create dir");
			}
		}
		
		System.out.println();
		System.out.println("Writing to a file");
		
		System.out.println("Enter a messege to be stored in file");
		String messege = userInput.nextLine();
		
		try (PrintWriter writer = new PrintWriter(file)){
			writer.println(messege);
			System.out.println("Info written to file");
		}
	
	
}
}

