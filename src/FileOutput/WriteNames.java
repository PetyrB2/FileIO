package FileOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {

	public static void main(String[] args) {
	
		// Create ArrayList names
		ArrayList<String> names = new ArrayList<>();
		// Add to ArrayList
		names.add("Bob");
		names.add("Pete");
		names.add("Tom");
		names.add("Tessa");
		names.add("Jane");
		names.add("Luke");
	
		// Begin try-catch
		try {
			// Create new PrintWriter pw to write to file names.txt
			PrintWriter pw = new PrintWriter("names.txt");
			//begin for loop
			for(String name: names) {
				pw.println(name);
			}//end for loop
			
			pw.close(); // Close - without this no data is written
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}// end try-catch
	}// end main

}//EOF
