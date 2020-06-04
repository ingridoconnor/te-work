package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cCyphEncrypt {

	

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		
		
		
		
		
		
		System.out.print("Enter the path of the file to encrypt>>>>>");
		String inPath = userInput.nextLine();
		
		File inFile = new File(inPath);
		
		Scanner inputFile = new Scanner(inFile);
		
		System.out.println("Enter offset>>>>>>");
		int offset = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Enter file name to write to>>>>>>>>>");
		String outPath= userInput.nextLine();
		File outFile = new File(outPath);
		PrintWriter outputFile = new PrintWriter(outFile);
		
		while(inputFile.hasNext()) {
			String originText = inputFile.nextLine();
			String cipherText = encrypt(originText, offset);
			outputFile.println(cipherText);
		}
		outputFile.flush();
		outputFile.close();
		inputFile.close();
		userInput.close();
		

	}
	public static String encrypt (String text, int offset) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(ch < 65 || ch > 123) {
				result += ch;
			}
			else if(Character.isUpperCase(ch)) {
				char newCh = (char)((ch + offset - 65) % 26 + 65);
				result += newCh;
			}else {
				char newCh = (char)((ch + offset - 97) % 26 + 97);
				result += newCh;
			}
		}
		
		
		return result;
	}

}
