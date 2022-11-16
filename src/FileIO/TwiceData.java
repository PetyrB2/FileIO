package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {

	public static void main(String[] args) {

		Scanner infile;
		PrintWriter pw;

		try {
			infile = new Scanner(new File("nums.txt"));
			pw = new PrintWriter("nums_times2.txt");

			
			int inputNum;
			while (infile.hasNext()) {
				inputNum = infile.nextInt();
				inputNum *= 2; // times 2
				pw.println(inputNum);

			} // end while loop

			// Close the sessions
			infile.close();
			pw.close();

			System.out.println("");
			System.out.println("\n\tPlease check nums times2.txt for your data");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());

		} // end try-catch
	}// end main

}// EOF