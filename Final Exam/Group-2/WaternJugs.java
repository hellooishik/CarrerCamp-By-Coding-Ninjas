/*
 * 
 * 
 * 
 * 
 * 
 * 
In the movie Die Hard 3, our heros, John McClain (Bruce Willis) and Zeus (Samuel L. Jackson), 
are at the bidding of the evil Peter Krieg (Jeremy Irons). 
First they are sent to the pay phone, then to the subway, and finally to the park. 
There is a fountain in the park. 
It is here that they must make exactly c gallons from a and b gallon jugs. 
It should be assumed that there is infinite supply of water from the fountain.
They are under much pressure. You have to help them determine 
if it is even possible to make exactly c gallons from a and b gallon jugs. 
If c liters of water is measurable, you must have c liters of water 
contained within one or both jugs by the end.

You are allowed to do the following things.
1. Fill any of the jugs completely with water.
2. Empty any of the jugs.
3. Pour water from one jug into another till the other jug is completely full or 
the first jug itself is empty.





Input Format:
First line of input contains an integer t, representing the number of test cases.
Next t lines follow input of 3 space separated integers a,b and c respectively.

Constraints:
1 <= t <= 3*10^5 
1 <= a <= 10^4 
1 <= b <= 10^4 
1 <= c <= 10^4 
Time Limit: 1 second

Output Format:
For each query, you have to print “Yes” if it is possible to make exactly c gallons from a and b gallon jugs, otherwise print “No”.
Sample Input 1:
1
3 5 4
Sample Output 1:
Yes
Explanation:
(0,0)->(0,5)->(3,2)->(0,2)->(2,0)->(2,5)->(3,4)
First, fill the 2nd jug with 5 litres and pour it into the 3 litres jug. Now 2 litres will be there in the 5-litre jug. Empty the 3-litre jug and pour 2 litres of the other jug into the 3-litre jug. Now again fill the 5-litre jug. 
Now completely fill the 3-litre jug with the 5-litre jug, leaving with 4 litres in the 5-litre jug.
Sample Input 2:
3
6 3 4
10 18 12
20 25 10
Sample Output 2:
No
Yes
Yes
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t > 0) {
            int a = scanner.nextInt(); // capacity of the first jug
            int b = scanner.nextInt(); // capacity of the second jug
            int c = scanner.nextInt(); // required capacity

            // Check if it is possible to make exactly c gallons from a and b gallon jugs
            if (canMeasureWater(a, b, c)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            t--;
        }

        scanner.close();
    }

    // Function to check if it is possible to make exactly c gallons from a and b gallon jugs
    private static boolean canMeasureWater(int a, int b, int c) {
        // If c is greater than the total capacity of the jugs, it is not possible
        if (c > a + b) {
            return false;
        }

        // If c is divisible by the greatest common divisor of a and b, it is possible
        return c % gcd(a, b) == 0;
    }

    // Function to calculate the greatest common divisor of two numbers using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}