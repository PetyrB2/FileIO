package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {

	public static void main(String[] args) {

		// Attributes
		Scanner namesFile;
		Scanner agesFile;
		PrintWriter pw;

		// begin try-catch
		try {
			// Tell the computer where attribs above are or will be
			namesFile = new Scanner(new File("StudentNames.txt"));
			agesFile = new Scanner(new File("StudentAges.txt"));
			pw = new PrintWriter("Names_and_Ages.txt");
			pw.println("------------------");
			pw.println("--  Begin List  --");
			pw.println("------------------");
			// Attributes for While Loop
			String tempName;
			int tempAge;
			// Begin While Loop
			while (namesFile.hasNext()) {
				tempName = namesFile.nextLine();
				tempAge = agesFile.nextInt();
				//Print this to File
				pw.println("Name: " + tempName);
				pw.println("Age: " + tempAge);
				pw.println("------------------");
			}//end While Loop
				// CLOSE UP FOR THIS TO WORK
			
				namesFile.close();
				agesFile.close();
				pw.close();
				System.out.println("");
				System.out.println("\n\tCheck Names_and_Ages.txt for your data.");
				
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}// end try-catch
	}// end main

}//EOF