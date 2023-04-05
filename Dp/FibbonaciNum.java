package Dp;

import java.util.Scanner;

public class FibbonaciNum {
	// Declering the functiion for Calcuting the fibbnaci series using recursion
	// Time Complexity 0(2n)
	public static int printFib(int n) {
		
		// Checking tghe base case
		if(n== 0 || n == 1) {
			return n;
		}
		int ans1 = printFib(n-1);
		int ans2 = printFib(n-2);
		int myAns = ans1 + ans2;
		return myAns; 
	}
	
	public static int countMinStepsToOne(int n) {
		//Your code goes here
		int storage[]=new int[n+1];
        storage[1]=0;

        for(int i=2;i<storage.length;i++)
        {
            int op1=Integer.MAX_VALUE;
            int op2=Integer.MAX_VALUE;
            int op3=Integer.MAX_VALUE;
            op1=storage[i-1];
            if(i%2==0)
                op2=storage[i/2];
            if(i%3==0)
                op3=storage[i/3];
            storage[i]=1+Math.min(Math.min(op1,op2),op3);
        }
        return storage[n];
	}
	
	// Priting the Fibbonacci Series using the Irretive Dynamic Programming 
	// Step 1:- Recursion 
	// Step 2:- Memozation
	// Step 3:- Using the DP Consepsts
	
	public static int fibbI(int n) {
		//Checking the base Case 
		if(n== 0 || n== 1) {
			return n;
		}
		// Assigning the Dp Index 
		int [] dp= new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		// Going with the Irretive way for sloving 
		for(int i = 0; i<n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	// Function to check the if it's Recursive or not
	public static int printBetter(int n, int dp[]) {
		// Checking the base case 
		if(n== 0 || n == 1) {
			return n;
		}
		// memorirorized teh calculation 
		
		int ans1,ans2;
		// If my Arr Dp is Empty of assumed value as a -
		// We'll Just return the answer one
		if(dp[n-1] == -1) {
			// Printing the nessary changes
			ans1 = printBetter(dp[n-1], dp);
			// Returing the answer by removing -1
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		// Function of the driver code
		// O(N) == Optimal Solution for Solving the Assesments 
		// As same as the answer two Propertics
		if(dp[n-2] == -1) {
			ans2 = printBetter(dp[n-2],dp);
			dp[n-2] = ans2;
		}else {
			ans2 = dp[n-2];
		}
		int MyAns = ans1 + ans2;
		return MyAns;
		// If data is Present in the Same Array
		     // if the data is found on the reatiev devicses 
		// calcuting the toatal number of num cases found  
		}
	
	

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] dp = new int[n+1];
			// Irreting over the array and fillup the vaule with -1
			for(int i = 0; i<dp.length ; i++) {
				dp[i] = -1;
			}
			int ans = printBetter(n,dp);
			System.out.print(ans);
		}

	}

}
