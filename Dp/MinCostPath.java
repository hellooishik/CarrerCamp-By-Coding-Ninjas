package Dp;
public class MinCostPath {
	/*
	 * 
			Min Cost Path Problem
			An integer matrix of size (M x N) has been given. Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1)		From a cell (i, j), you can move in three directions:
			1. ((i + 1),  j) which is, "down"
			2. (i, (j + 1)) which is, "to the right"
			3. ((i+1), (j+1)) which is, "to the diagonal"
			The cost of a path is defined as the sum of each cell's values through which the route passes.
			
13
	 */
	
	// Solving the Problems using Itterieve Apporach
	public static int MiniMumPathIt(int[][] Data) {
		// Decelaring rows and the Cols 
		int m = Data.length;
		int n = Data[0].length;
		
		// Declearing the Dynamic Programming  with an extra Index 
		int [][] dp = new int[m+1][n+1];
		// Intiazing all the DP Array with all the infinity Value 
		for(int i= 0; i< dp.length; i++) {
			for(int j= 0; j < dp[0].length; j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
			
		}
		for(int i = m-1; i>= 0; i--) {
			for(int j = n-1; j>=0; j--) {
				if(i == m-1 || j== n-1) {
					dp[i][j] = Data[i][j];
					continue;
				}
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j]; 
				int ans3 = dp [i+1][j+1];
				dp[i][j] = Data[i][j] + Math.min(ans1, Math.min(ans2, ans3));
				
			}
			
		}
		return dp[0][0];
		
	}
	public static int CalMinPathDp(int [][] Data, int i, int j, int [][] dp) {
		int m = Data.length;
		int n = Data[0].length;
		// Speal Case 
		if(i == m-1 && j == n-1) {
			return Data[i][j];
		}
		
		
		// Asining the Length and Matrix Start Index 
		// Base Case CalCulation
		if(i>=m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		
		int ans1,ans2,ans3;
		
		if(dp[i][j] == Integer.MIN_VALUE) {
			ans2 = CalMinPath(Data, i+1, j);
			dp[i+1][j] = ans2;
		}else {
			ans2 = dp[i+1][j];
			
		}
		
		if(dp[i][j] == Integer.MIN_VALUE) {
			ans1 = CalMinPath(Data , i, j+1);
			dp[i][j+1] = ans1;
		}else {
			ans1 = dp[i][j+1];
		}
		

		if(dp[i][j] == Integer.MIN_VALUE) {
			ans3 = CalMinPath(Data, i+1, j+1);
			dp[i+1][j+1] = ans3;
		}else {
			ans3 = dp[i+1][j+1];
		}
	
		
		
		int myAns = Data[i][j] + Math.min(ans1 , Math.min(ans2, ans3));
		
		return myAns;
	}
	
	public static int CalMinPath(int[][] Data, int i, int j) {
		// Recursive Solution 
		//For handlinging the  Matrix OutofBounds Exceptions
		int m = Data.length;
		int n = Data[0].length;
		// Speal Case 
		if(i == m-1 && j == n-1) {
			return Data[i][j];
		}
		
		
		// Asining the Length and Matrix Start Index 
		// Base Case CalCulation
		if(i>=m || j >= n) {
			return Integer.MAX_VALUE;
		}
		
		
		
		
		// Calculating the Direction path Which towards the Traversing it's been Actually working
		// Posible Direction Towards Right
		int ans2 = CalMinPath(Data, i+1, j);
		// Posible Direction is Downwords = 0,0 > 0,1
		int ans1 = CalMinPath(Data , i, j+1);
		// Posible Direction Of angle wise = 0,0 = 1,1
		int ans3 = CalMinPath(Data, i+1, j+1);
		
		// Result
		int myAns = Data[i][j] + Math.min(ans1 , Math.min(ans2, ans3));
		
		return myAns;
	}
		public static void main(String args[]) { 
			int [][] Data = {{1,5,11},{8,13,12},{2,3,7}};
			// Intiazing the Dynamic Array into the Main Stream with an Extra Row and Colum 
			// Avioding the Array outOfBound Exception
			
			int [] [] dp = new int[Data.length + 1][Data[0].length +1];
			// For Rows
			for(int i = 0; i<dp.length; i++) {
				// For Cols
				for(int j = 0; i<dp[0].length ; j++) {
					// Intiazing the Minus Infity Vaule To thE Each Row and Cols 
					dp[i][j] = Integer.MIN_VALUE;
				}
			}
			int ans = MiniMumPathIt(Data);
			System.out.println(ans);
		}
	}

