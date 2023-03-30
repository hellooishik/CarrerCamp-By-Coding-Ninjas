package FunctionAndScope;
public class printFahrenheitTable{
public static void printFahrenheitTable(int start, int end, int step) {
	/* Your class should be named Solution 
	 * Don't write main(). 
	 * Don't read input, it is passed as function argument. 
	 * Print the specified output in required format. 
	 * Taking input is handled automatically. 
	 */
    int temp = 1;
	while(start <= end){
		temp=((5*(start-32))/9);
         System.out.println(start+" "+temp);
        start+=step;
	}
	return ;
}
public static void main(String args[]){
	printFahrenheitTable(0, 100, 20);
}
}

