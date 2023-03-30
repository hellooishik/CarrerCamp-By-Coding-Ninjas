package Patterns;

import java.util.Scanner;


/*
 
*
*** 
*****
*******

*/

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= n - i) {
				System.out.print(" ");
				space++;
			}
			int num = 1;
			while (num <= i) {
				System.out.print("*");
				num++;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print("*");
				dec--;
			}
			System.out.println();
			i++;
		}
	}

}
