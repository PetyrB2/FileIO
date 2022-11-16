package FileOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputfun {

	public static void main(String[] args) {
		// Begin try-catch
		try {
			// Call PrintWriter to write to file
			PrintWriter pw = new PrintWriter("output.txt");

			// Data being printed to the output.txt file
			pw.println("----------------------------");
			pw.println("Hello World!");
			System.out.println("");
			pw.println("My name is Peter.");
			System.out.println("");
			pw.println("Welcome to File Output Fun.");
			pw.println("----------------------------");
			pw.close();

			// Some Information to print out to user.

			System.out.println("\tCheck output.txt for your data.");
			System.out.println("");

			// Catch FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("Could not Write to File...");
		} // end of try-catch

	}// end of main

}// EOF
