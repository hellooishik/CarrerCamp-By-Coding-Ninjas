package RecursionDeep;

import java.util.Scanner;


// Subsequnce of a Strings Calcution Using Recusion
// ABC


public class DiveRecursion {
	public static String[] subsequnce(String input) {
		//Checking the base case
		if(input.length()== 0){
			String [] output = new String[1];
			// Assign First Array Index With Empty Arr
			output[0] = "";
			return output;
			
	}
		String[] SmallOutput = subsequnce(input.substring(1));
		String[] output = new String[SmallOutput.length * 2];
		for(int i = 0; i<SmallOutput.length; i++) {
			output[i] = SmallOutput[i];
		}
		for(int i=0; i<SmallOutput.length; i++) {
			output[SmallOutput.length+i] = input.charAt(0) + SmallOutput[i];
			}
			return output;
	}
	
	// This String will collect all the tokens for the viewpoint
	// Time Complexity will be running on 0(n)
	
	// this is a Non-Genereted Tokens For time complexity analiysis
	// If9rrot == null)}
	
	// Referenece to this object is consider as a tickertAPE.fusion
	
	public static void main(String  args[]) {
		try (// subsequnce(output.length());
		Scanner TakeInput = new Scanner(System.in)) {
			System.out.println("Enter The Strings");
			String input = TakeInput.next();
			String[] output = subsequnce(input);
			for(String s : output) {
				System.out.println(s);
			}
		}
	
	}
		

}
