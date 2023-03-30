package Patterns;

import java.util.Scanner;
/*
 
1
21
321
4321

 */

public class pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(i - j + 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
