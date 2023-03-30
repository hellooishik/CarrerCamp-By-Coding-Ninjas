package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class printLongestConsecutiveIncreasingSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		// Implenting ArrayList to store the Sequence
		ArrayList<Integer> output = new ArrayList<>();
		// Implenting the HashMap to count data
        HashMap<Integer, Boolean> map = new HashMap<>();
		// Calcuting the lenghth
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            map.put(arr[i],true);
        }
        int maxStart=-1,maxLen=0;
       // boolean startCheck=true;
        
        for (int i: arr)
        {
            if (map.get(i))
            {
                int currStart=i,currLen=1;
                boolean flag=true;
                map.put(i,false);
                
                int ahead=i+1;
                while(flag)
                {
                    if(map.containsKey(ahead))
                    {
                        //System.out.println(ahead+" is included in sequence and status updates to false");
                        currLen=currLen+1;
                        map.put(ahead,false);
                        ahead=ahead+1;
                        //System.out.println("Current length of sequence: "+currLen);
                    }
                    else
                    	// Longest the Subsequence
                    {
                     	flag=false;   
                    }
                }
               flag=true; 
               int before=i-1;
                while(flag)
                {
                    if(map.containsKey(before))
                    {
                        //System.out.println(before+" is included in sequence and status updates to false");
                        currLen=currLen+1;
                        currStart=before;
                        map.put(before,false);
                        before=before-1;
                        //System.out.println("Current length of sequence: "+currLen);
                    }
                    else
                    {
                     	flag=false;   
                    }
                }
               
               System.out.println();
               if (currLen>=maxLen)
               {
                   maxLen=currLen;
                   maxStart=currStart;   
                   lenMap.put(maxStart,maxLen); 
               }
            }
            
        }
        
        
        for (int i=0;i<arr.length;i++)
        {
            if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i])>=maxLen)
            {
                maxStart=arr[i];
                maxLen=lenMap.get(arr[i]);
                break;
            }
        }
        output.add(maxStart);
        output.add(maxStart+maxLen-1);
        return output;
    }
}
