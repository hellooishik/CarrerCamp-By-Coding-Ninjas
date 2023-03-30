package binaryTree;

public class binaryTreeNode<T>{
	// data and branches
	// keeping as generic
	public T data;
	public binaryTreeNode<T> right;
	public binaryTreeNode<T> left;
	
	public binaryTreeNode(T data) {
		this.data = data;
	}
	
}
