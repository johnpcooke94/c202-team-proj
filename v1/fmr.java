import java.util.*;
import java.util.regex.*;

public class fmr {

	public static void main(String[] args) {

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
		
	}//main

}//class

