package TestTwo;

public class MaximumNumber {
	public static int max_number(int n){

	 int maxPow = 1;

     while (maxPow < n) {

         maxPow *= 10;

     }

     for (int i = maxPow / 10; i >= 10; i /= 10) {

         int digit = n / i % 10;

         int right = n / (i / 10) % 10;

         if (digit < right) {

             return n % i + n / (i * 10) * i;

         }

     }

     return n / 10;

     
 }
}
	
