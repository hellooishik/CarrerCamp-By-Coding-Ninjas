package HashMap;
import java.util.HashMap;

public class intersection {
	public static void Printintersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		if(arr1.length==0 || arr2.length==0)
            return ;
            HashMap<Integer,Integer> harr1=new HashMap<>();
            for(int i=0;i<arr1.length;i++)
            {   if(harr1.containsKey(arr1[i])){
				harr1.put(arr1[i],harr1.get(arr1[i])+1);
			}
                
             else{
				 harr1.put(arr1[i],1);
			 }
                 // ITTERING OVER LOOPS
            }
            
            for(int i=0;i<arr2.length;i++)
            {
                if(harr1.containsKey(arr2[i])){
                    if(harr1.get(arr2[i])!=0){
                
                    System.out.println(arr2[i]);
                    harr1.put(arr2[i],harr1.get(arr2[i])-1);
                    }
                }
                else{
					continue;
				}
                    


            }
	}

}
