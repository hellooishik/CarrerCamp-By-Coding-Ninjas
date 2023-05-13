/*
 Given an integer array A of size N and an integer k, 
 check if it is possible to choose a group of some of the integers 
 in the array such that the group sums to the given target k.
There is one with this additional constraint -
if there are numbers in the array that are adjacent and having identical values, they must either all be chosen, or none of them chosen.
Return true or false.
For example, with the array {1, 2, 2, 2, 5, 2}, 
either all three 2's in the middle must be chosen or not, all as a group.



Input Format :
Line 1 : Integer N
Line 2 : Elements of array (separated by space)
Line 3 : Integer k


Output Format :
true or false
Constraints :
1 <= N <= 30
1 <= Ai <= 10^4


Sample Input 1 :
4
2 4 4 8
14

Sample Output 1 :
false
Sample Input 2 :
5
2 4 4 1 8
16
Sample Output 2 :
true
 */
public class Solution {

    public static boolean subsetSumToKIdentical(int input[], int n, int k) {
        // Initialize a boolean array to keep track of whether a particular sum is possible or not
        boolean[][] dp = new boolean[n + 1][k + 1];
        
        // A sum of 0 can always be obtained by choosing an empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        
        // A subset cannot have a sum greater than k
        for (int i = 1; i <= k; i++) {
            dp[0][i] = false;
        }
        
        // Populate the rest of the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                // If the current element is greater than the target sum, it cannot be included in any subset that sums to the target
                if (input[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Check if the current element can be included or not
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - input[i - 1]];
                }
            }
        }
        
        // Check if a subset sums to k, taking into account the additional constraint
        int i = n;
        while (i > 0 && input[i - 1] == input[n - 1]) {
            i--;
        }
        for (; i <= n; i++) {
            if (dp[i][k]) {
                return true;
            }
        }
        
        return false;
    }
}