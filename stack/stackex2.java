package stack;
import java.util.Stack;

public class stackex2 {
	public  static void main(String args[]) {
	Stack<Integer> stack=new Stack<Integer>();
    for(int i=0;i<10;i++)
    {
        stack.push(i*2);
    }
    System.out.print(stack.peek());
}
}