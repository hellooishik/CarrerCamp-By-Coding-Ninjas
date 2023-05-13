/*
 * Break Numbers
Given an integer n, break it into smaller numbers such that their summation is equal to n. 
Print all such combinations in different lines.
Note : [1, 2, 1] and [1,1, 2] are same, so print the particular sequence with increasing order. 
Order of different combinations doesn't matter.

Input format :
Integer n
Output format :
Print all possible combinations in different lines

Constraints :
1 <= n <= 100

Input :
4

Output :
1 1 1 1
1 1 2
1 3
2 2
4
 */

 public class solution {
	public static void printCombination(int num){
		//Write your code here
		printCombinationHelper(num, "", 1);
    }

    private static void printCombinationHelper(int num, String combination, int start) {
        if (num == 0) {
            // Base case: all numbers have been used
            System.out.println(combination.trim());
            return;
        }

        for (int i = start; i <= num; i++) {
            // Add the current number to the combination and continue recursively
            printCombinationHelper(num - i, combination + i + " ", i);
        }
    }

    public static void main(String[] args) {
        int num = 4;
        printCombination(num);
    }
	
}
