package Operators;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x == 0 || x == 1)
        {
            System.out.println(x);
        }
        else
        {
            int i = 1, result = 1;
            
            while (result <= x)
            {
                i++;
                result = i * i;
            }
        
            System.out.println(i - 1);
        }
	}

}
