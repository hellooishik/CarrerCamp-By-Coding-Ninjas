package Operators;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] binaryNum = new int[32];
			int i = 0;
			if(n==0)
			{
			    System.out.println(0);
			}
			
			while (n > 0) 
			{
			    binaryNum[i] = n % 2;
			    n = n / 2;
			    i++;
			}
 
			for (int j = i - 1; j >= 0; j--)
			{
			    System.out.print(binaryNum[j]);
			}
		}

    }
}