import java.util.*;
import java.util.regex.*;

public class fmr {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
		
			if (args[i].equals("-h")) {
				System.out.println("This program takes a string and a regex and outputs the found tokens of the regex");
				System.exit(0);
			}//if

		}//for

		int fileInput = -1;
		
		for (int i = 0; i < args.length; i++) {
		
			if (args[i].equals("-f") {
				fileInput = i;
			}//if
		
		}//for

		if (fileInput != -1) {
			
			String fileName = args[fileInput];
			Pattern pattern = Pattern.compile(args[fileInput + 2]);

			try {
				FileReader freader = new FileReader(fileName);
				Bufferedreader br = new BufferedReader(freader);
			}//try

			catch {

			}//catch

		}//

		else {
			String line = args[0];
			String regex = args[1];

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(line);
			boolean found = false;
		
			while (matcher.find()) {
		
				System.out.println("I found text " + matcher.group() + " starting at index " +
					 matcher.start() + " and ending at " + matcher.end());
		
			}//while		
		
			if (!found) {
				System.out.println("No match found");
			}//if
		}//else
	}//main

}//class

