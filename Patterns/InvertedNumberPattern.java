package Patterns;

import java.util.Scanner;
/*
4444
333
22
1
 */
public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			
			while(j<=n-i+1){
				
				System.out.print(n-i+1);
				j=j+1;
			}
			
			System.out.println();
			i=i+1;
		}
	}

}
