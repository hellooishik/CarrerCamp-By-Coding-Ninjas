package HashMap;
import java.util.HashMap;
public class printPairSum {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

		// Checking the base case 
		if(size == 0){
			return 0;
		}

		// implementing the hashmap
		HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:input)
        {	
            if(map.containsKey(key))
        	{
            	map.put(key,map.get(key)+1);
        	}
            else
            {
                map.put(key,1);
            }   
        }
        /*
        for (Integer i: map.keySet())
        {
            System.out.println(i + ": " + map.get(i));
        }
        System.out.println();
        */
        int countPairs=0;
        for (Integer i: map.keySet())
        {
            if (map.containsKey(-i) && i!=0)
            {
                //System.out.println("Found the negative of " + i);
            	countPairs=countPairs+(map.get(i)*map.get(-i));   
                //System.out.println("Current count of pairs: "+countPairs);
                //map.remove(i);
            }
            //System.out.println();
        }
        countPairs=countPairs/2;
        if (map.containsKey(0))
        {
            int val=map.get(0);
            countPairs=countPairs+(val*(val-1))/2;
        }
        return countPairs;
	}
}
