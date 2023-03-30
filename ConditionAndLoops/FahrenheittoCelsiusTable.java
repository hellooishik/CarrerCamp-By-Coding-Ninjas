package ConditionAndLoops;

import java.util.Scanner;

/*
 * Fahrenheit to Celsius Table
Send Feedback
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
3 integers - S, E and W respectively 
Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
Constraints :
0 <= S <= 90
S <= E <=  900
0 <= W <= 80 
 */

public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int S=s.nextInt();
	    int E=s.nextInt();
	    int W=s.nextInt();
		int fah;
	        
	        while(S<=E)
	        {
	         
	            fah=((5*(S-32))/9);
	             System.out.println(S+" "+fah);
	            S+=W;
	        }
	}

}
