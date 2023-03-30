package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;
	
	// mAKING A CONSTCTOR
	// a CONSTACTOR HAS NO CLASS , IT'S JUST A FUNCTION WHICH TAKING THE REFERCENE
	public TreeNode(T data) {
		this.data= data;
		this.children = new ArrayList<>();
	}
}
