package stack;
import linkedlist.Node;

public class stackUsingLL<T> {
	private Node head;
    private int size;
    private Node tail;

    public stackUsingLL(){
        head= null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    //Pushing happening at he begining of the LL
    public void push(T elem){
        Node<T> newNode = new Node(elem);
        newNode.next = head;
        head= newNode;
        size++;
    }

    //Since pushing is happening at first node
    public T top() throws StackEmptyException{
    if(head==null){
        throw new StackEmptyException();
    }
    return head.data;

    }

    public T pop() throws StackEmptyException{
    if(head==null){
        throw new StackEmptyException();
    }
    //since we are pushing data in the front so the so we must remove the data from the front itself
    T temp =head.data;
    head = head.next;
    size--;
    }
}
