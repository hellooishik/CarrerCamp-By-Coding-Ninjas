/*
 * Binary Sum
 * 
 * 
Ninja is playing with Binary Strings at his Granny’s house. Granny is always encouraging Ninja to practice math. So she has given him two binary strings. He has to return their sum as a binary string. Can you do it for Ninja?


Input Format:
First line of input contains an integer t, representing the number of test cases.
First line of input of each test case contains the first binary string.
Second line of input each test case contains the second binary string.


Constraints:
1 <= t <= 100
1 <= length of each string <= 10000
Time Limit: 1 second


Output Format:
For each query, you have to print the sum of the two given binary strings as a binary string.

Sample Input 1:
1
1010001
1101

Sample Output 1:
1011110

Sample Input 2:
2
11001100
10
10000001
111101

Sample Output 2:
11001110
10111110

 */

 // ****************** Code **************
 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            String binary1 = scanner.nextLine();
            String binary2 = scanner.nextLine();

            String sum = addBinaryStrings(binary1, binary2);
            System.out.println(sum);
        }
    }

    private static String addBinaryStrings(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? Character.getNumericValue(binary1.charAt(i)) : 0;
            int digit2 = j >= 0 ? Character.getNumericValue(binary2.charAt(j)) : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }
}