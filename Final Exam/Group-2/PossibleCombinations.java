/*
 You are given N integers (12<N<20) in sorted order and 
 your task is to print all the possible combinations of the numbers that can be used to choose 12 numbers out of the given N numbers in sorted order.


 Input Format:
First line contains N - (Integer)
Second line contains N spaced integers which are player Id of players. Note that, all the N integers are given in sorted order.


Output Format:
Print the space separated combinations in N lines
Constraints
12<= N <= 20
1 <= Ai <=1000


Sample Input :
13
1 2 3 4 5 6 7 8 9 10 11 12 13


Sample Output :
1 2 3 4 5 6 7 8 9 10 11 12
1 2 3 4 5 6 7 8 9 10 11 13 
1 2 3 4 5 6 7 8 9 10 12 13 
1 2 3 4 5 6 7 8 9 11 12 13 
1 2 3 4 5 6 7 8 10 11 12 13 
1 2 3 4 5 6 7 9 10 11 12 13 
1 2 3 4 5 6 8 9 10 11 12 13 
1 2 3 4 5 7 8 9 10 11 12 13 
1 2 3 4 6 7 8 9 10 11 12 13 
1 2 3 5 6 7 8 9 10 11 12 13 
1 2 4 5 6 7 8 9 10 11 12 13 
1 3 4 5 6 7 8 9 10 11 12 13 
2 3 4 5 6 7 8 9 10 11 12 13
 */

 import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	    public static void generateCombinations(int[] arr, int n, int r, int index, int[] data, int i) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }
        if (i >= n) {
            return;
        }
        data[index] = arr[i];
        generateCombinations(arr, n, r, index+1, data, i+1);
        generateCombinations(arr, n, r, index, data, i+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = 12; // choose 12 numbers out of N
        int[] data = new int[r];
        generateCombinations(arr, n, r, 0, data, 0);
    }
}
