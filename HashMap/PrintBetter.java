package HashMap;

import java.util.HashMap;

public class PrintBetter {
	private static void printInterSection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// Idea is to colleting the total number of the frequency from the Arr1
		// Ittaring over the arr 1
		for(int i = 0; i<arr1.length; i++) {
			// if the map get the present value we have to take it
			if(map.containsKey(arr1[i])) {
				// Getting the vaule from array
				// int vaule = map.get(arr1[i]);
				
			}else {
				// If the element is not present in the arr we have to add it
				// Setting the map value
				map.put(arr1[i], 1);
			}
			
		}
		for(int i = 0; i<arr2.length; i++) {
			// Ittiring over the array
			if(map.containsKey(arr2[i])) {
				// getting the value
				int freq = map.get(arr2[i]);
			
				// if the frequency not less than zero then it's intersected 
				if(freq > 0) {
					System.out.print(arr2[i] + " ");
					// Return the map after removing one intersected freq
				}
					map.put(arr2[i], freq-1);
			}
		}
				
				
		
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 7, 5, 3, 2, 5, 9, 7};
		int arr2[] = {3, 5, 9, 2, 7, 5, 1, 9};
		printInterSection(arr1, arr2);

	}

}
