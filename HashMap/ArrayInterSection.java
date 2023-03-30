package HashMap;
import java.util.Arrays;

public class ArrayInterSection {
	public static void ArrInterSec(int arr[], int arr2[]) {
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		// Declaring the Length
		int n = arr.length;
		int m = arr2.length;
		
		// pointer to Ittenter over 2d Arr
		int i = 0;
		int j = 0;
		
		// Loop
		while(i<n && j<m) {
			if(arr[i] == arr2[j]) {
				System.out.print(arr + " ");
				i+= 1;
				j += 1;
			}else if(arr[i] <arr2[j]) {
				i += 1;
			}else {
				//  Observing the Root Directory 
				// tanging Tokens For the Lead 
				// converting the nessary Changes into tbhe AuTH Acces.
				//The neasary tagins 
				
				
			
			}
		}
	}
}
