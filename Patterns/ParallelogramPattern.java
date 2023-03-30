package Patterns;

import java.util.Scanner;
/*
***
 ***
  ***
 */
public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
