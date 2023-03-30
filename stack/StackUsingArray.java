package stack;

public class StackUsingArray {
	private int data[];
    private int topIndex;  //Index of the top most element of the stack

    public StackUsingArray(){
        data= new int[10];
        //HEAD POINTIN G 
        topIndex=-1;
    }

    public void StackUsingArray1(){
        data= new int[10];
        topIndex=-1;
    }

    private int size() {
    	
    }
    //O(1)
    public int size(){
        return topIndex+1;

    }
    //O(1)
    public boolean isEmpty(){

          //if(topIndex==-1) return true;
          //else return false;
          return topIndex == -1;
    }
    //O(1)
    public void push(int elem) throws StackFullException{
        //If stack is full
        if(topIndex==data.length-1){
            //StackFullException e= new StackFullException();
            //throw e;
            //Throw Exception
        	//Double to arrayList size
            doubleCapacity();
        }
        topIndex++;
        data[topIndex]= elem;
  }
    //method to the Double Capacity
  private void doubleCapacity(){
  //  System.out.println("doubleCapacity");
      int temp[]= data;
      data= new int [2 * temp.length];
      for(int i=1;i<temp.length;i++){
          data[i]= temp[i];
      }

  }
    //O(1)
    public int top() throws StackEmptyException, Exception{
      if(topIndex==-1){
        //Throw stack empty exception
        throw new StackFullException();
      }
        return data[topIndex];

    }
    //O(1)
    public int pop() throws StackEmptyException{

        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
