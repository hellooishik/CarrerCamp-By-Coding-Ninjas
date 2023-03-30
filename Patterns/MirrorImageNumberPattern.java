package Patterns;

import java.util.Scanner;
/*
 	1 
   12
  123
 */

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) {
			int space = 1;
			while(space <= n -i) {
				System.out.print(" ");
				space++;
			}
			int  j =  1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
