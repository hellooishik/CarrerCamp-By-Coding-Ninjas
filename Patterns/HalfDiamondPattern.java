package Patterns;

import java.util.Scanner;
/*
 
 
 
*
*1*
*121*
*12321*
*121*
*1*
*



 */
public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");
        for (int i = 1; i <= n; i++) 
        {
            int j = 1;
            System.out.print("*");
            while (j <= i)
            {
                System.out.print(j);
                j++;
            }
            j--;
            while (--j >= 1)
            {
                System.out.print(j );
            }
            System.out.println("*");
        }
        for (int i = n - 1; i >= 1; i--) 
        {
            int j = 1;
            System.out.print("*");
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            j--;
            while (--j >= 1) 
            {
                System.out.print(j );
            }
            System.out.println("*");
        }
        System.out.println("*");

	}

}
