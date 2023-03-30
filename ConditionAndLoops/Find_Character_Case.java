package ConditionAndLoops;

import java.util.Scanner;



/*
 * Find Character Case
Send Feedback
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
Input format :
Single Character
Output format :
1 or 0 or -1
Constraints :
Input can be any character
 */

public class Find_Character_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char b =sc.next().charAt(0);
        if(b>= 'A' && b<='Z')
        {
            System.out.println("1");
        }
            else if(b>= 'a' && b<='z'){
                System.out.println("0");
            }
                else{
                     System.out.println("-1");
                }
	}

}
