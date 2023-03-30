package Patterns;
import java.util.Scanner;
/*
 
 ----------------------------------------------------------------------------------------------------------------------------------
			 
											1357
											3571
											5713
											7135
			
-----------------------------------------------------------------------------------------------------------------------------------

 */


// Secure the database
// PR Code= 002855..55258..25612



public class OddSquare {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++)
			{
			    for (int j = i - 1; j < n; j++ )
			    {
			        System.out.print(j * 2 + 1 + "");
			    }
			    
			    for(int k = 0; k < i - 1; k++)
			    {
			        System.out.print(k * 2 + 1 + "");
			    }
			    System.out.println();
			}
		}
	}

}
