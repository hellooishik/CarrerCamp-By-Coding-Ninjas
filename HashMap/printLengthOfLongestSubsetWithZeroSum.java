package HashMap;

import java.util.HashMap;

public class printLengthOfLongestSubsetWithZeroSum {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,maxLen=-1;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            //System.out.println("Current cumulative sum: "+sum);
            if (sum==0)
            {
                maxLen=i+1;
            }
            // for(int i = 0; i<arr.length; i++){
            // if(root == null){
            // For every loop teh sequence will be runs in a global entity
            // for loop will run on the consective entries
            // If the data found some of the missblities
            if (map.containsKey(sum))
            {
            	// Ittering over the arrays
                int prevIndex=map.get(sum);
                //System.out.println("Sum found previously at index: "+prevIndex);
                int currLen=i-prevIndex;
                //System.out.println("Length of 0 sum: "+currLen);
                if (currLen>maxLen)
                {
                    maxLen=currLen;
                    //System.out.println("Max Length of 0 sum: "+maxLen);
                }
            }
            // If the ittering over array is failed for some
            else
            {
                //System.out.println("Adding sum to HashMap");
                map.put(sum,i);
            }
            //System.out.println();
        }
        return maxLen;
	}
}
