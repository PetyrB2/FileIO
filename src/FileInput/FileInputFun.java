package FileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: File Input Demo");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tThis demo is with Numbers only."
				+ "\n\tIt prints out the numbers in a file named input.txt"
				+ "\n\tAdded mismatch exception & Sum of some input values");
		System.out.println("========================\n");
		System.out.println("");
		// Begin code
		
		
		Scanner infile;
		
		try {
			infile = new Scanner(new File("input.txt"));
			int input;
			int sum = 0;
			
			//Begin While Loop
			while(infile.hasNext()) {
				input = infile.nextInt();
				System.out.println(input);
				
				sum += input; // sum = sum + input 
				
			}//end while
			System.out.println("===================");
			System.out.println("");
			System.out.println("The sum of all the numbers is: \n\t" + sum);
			infile.close();	
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("File not Found !");
			System.out.println(ex.getMessage());
		}//end try-catch
		
		catch(InputMismatchException ex) {
			System.out.println("Error Reading Input. Expected Numerical Values Only!");
		}// end mismatch catch
		
		
	}//end main

}
