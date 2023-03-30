package HashMap;
import java.util.HashMap;
import java.util.Set;

public class HashMapUse {
	// Creating An HashMap
	// Insert Data Into HashMap
	// Delete Data from the hashmap
	// Traversal of the hashmap
	// Total Size of THE HASHMAP
	
	// Implement of the hashmap
	// Putting the main function 
	public static void main (String args[]) {
		HashMap<String, Integer> map = new HashMap<>();
		// Storing the data into hashmap
		// TIME COMPLEXITY RUNS ON 0(1)
		// PUT fUNCTION
		map.put("abc", 10);
		map.put("dbf", 20);
		map.put("ghi", 30);
		map.put("jkl", 40);
		
		// Calcuting THE SIZE OF THE HASHMAP
		System.out.println(map.size());
		
		// Check if the KEY IS PRESENT OF THE MAP OR NOT VIA LOOP
		if(map.containsKey("abc")) {
			System.out.println("Key exits");
		}else {
			return;
		}
		//Remove data from the map using  remove function
		map.remove("dbf");
		System.out.println(map.size());
		// Travelsal over the loop
		
		
		// Travelsal over map
		Set<String> Keys = map.keySet();
		for(String s:Keys) {
			System.out.println(s);
		}
	}
	
	

}
