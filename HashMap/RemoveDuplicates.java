package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	// MAKE A ARRAYLIST CLASS
	public static  ArrayList<Integer> removeDuplicates(int[] arr){
		// Create a new arraylist
		ArrayList<Integer> output = new ArrayList<>();
		// Create 
		HashMap<Integer,Boolean> map = new HashMap<>();
		// Ittaring over Arraylist
		for(int i = 0; i<arr.length; i++) {
			// If The map founds simmiur entries
			// if the map already taken the value just skip it 
			if(map.containsKey(arr[i])) {
				continue;
			}
			else {
				// If the map founds a new output just add into the Output ArrayLIST
				output.add(arr[i]);
				// Put the data into the map
				map.put(arr[i], true);
			}
		}
		return output;
		// Adjustement entries
		// over the array consicutive issuse
		// for handing some of the  coner cases
		// WE HAVE TO STARTED A LOOP THAT RUNS OVER THE CONTINANTAL OVERSESS
		
	}
}
