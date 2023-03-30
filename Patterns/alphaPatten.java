package Patterns;

import java.util.Scanner;
/*
 A
 BB
 CCC
 */
public class alphaPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			while(j<= i){
				char jthChar = (char) ('A' + i -1);
				System.out.print(jthChar);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
