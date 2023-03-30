package FunctionAndScope;

public class FibonacciNumber {

	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int a = 0;
		int b = 1;
		if (n == 0) {
			return true;
		}
		while ((a + b) <= n) {
			int temp = a + b;
			a = b;
			b = temp;
			
			if (n == temp) {
				return true;
			}
		}
		return false;
	}
	

}
