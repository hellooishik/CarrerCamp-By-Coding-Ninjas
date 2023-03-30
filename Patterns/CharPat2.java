package Patterns;

import java.util.Scanner;
// INTERESTING PATTERNS 
/*
E
DE
CDE
BCDE
ABCDE
*/


public class CharPat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m;
		char c = (char) (65 + N);
		for (int i = 1; i <= N; i++) {
			c = (char) (c - i);
			for (int j = 0; j < i; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println("");
		}

	}

}
