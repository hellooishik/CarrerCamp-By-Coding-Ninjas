package Patterns;

import java.util.Scanner;
/*
A
BC
CDE
DEFG
 */

public class CharPat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			int  Start = 'A'+i-1;
            while(j<= i){
                System.out.print((char)(Start));
                j++;
               Start++;
            }
			System.out.println();
			i++;
		}

	}

}
