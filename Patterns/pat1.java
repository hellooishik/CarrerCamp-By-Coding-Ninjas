package Patterns;

import java.util.Scanner;

public class pat1 {
/*
 
 
 
4444
4444
4444
4444




 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	while(i<=n){
		int j = 1;
		while(j<=n){
			System.out.print(n);
			j++;
		}
		System.out.println();
		i++;
		
	}
}
}
