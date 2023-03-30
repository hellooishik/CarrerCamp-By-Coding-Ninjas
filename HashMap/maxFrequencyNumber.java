package HashMap;
import java.util.HashMap;

public class maxFrequencyNumber {
	 public static int PrintmaxFrequencyNumber(int[] arr){ 
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
			HashMap<Integer, Integer> h = new HashMap<>();
			for(int i=0;i<arr.length;i++){
	            if(h.containsKey(arr[i])){
	                h.put(arr[i],h.get(arr[i])+1);
	            }
	            else
	                h.put(arr[i],1);
	        }
	        int max=0;
	        int maxKey=Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++)
	       
	        {
	            if(h.get(arr[i])>max){
	                max=h.get(arr[i]);
	                maxKey=arr[i];}
	        }
	     


	        return maxKey ;
	    }
}
