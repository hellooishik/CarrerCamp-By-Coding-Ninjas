package Operators;

import java.util.Scanner;

public class Reverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int d, number,temp, revnum = 0;
	        Scanner sc = new Scanner(System.in);
	        number = sc.nextInt();
	        temp = number;
	        
	        while (temp >0) 
	        {
	            d = temp %10;
	            revnum = (revnum*10)+d;
	            temp = temp/10;
	        }
	        
	        System.out.println(revnum);

	}

}
