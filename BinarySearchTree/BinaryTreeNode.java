package BinarySearchTree;


public class BinaryTreeNode<T>{
	// data and branches
	// keeping as generic
	public T data;
	public BinaryTreeNode<T> right;
	public BinaryTreeNode<T> left;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
	
}