package Trees;

public class TreeUse {
	// fuction to print a tree(APPORACH - 1)
	public static void printTree(TreeNode<Integer> root) {
		
		// Special case 
		if(root == null) {
			return;
		}
		// Print the root
		System.out.print(root.data + " ");
		
		// Irtarating way and go each element O(n)
		for(int i = 0 ; i<root.children.size(); i++) {
			// Creating the new node and added when the loop is running
			TreeNode<Integer> child = root.children.get(i);
			// Using recurtion
			printTree(child);
		}
	}
	// Print more effienecely
	public static void printBetter(TreeNode<Integer> root) {
		// Special case
		if(root == null) {
			return;
		}
		// the first root was called by this statement
		System.out.print(root.data + " :");
		//irriting every nodes
		for(int i= 0; i<root.children.size(); i++ ) {
			System.out.print(root.children.get(i).data + " ");
		}
		// Print on the new line
		System.out.println();
		// fetching the node sub-tree
		for(int i = 0; i<root.children.size(); i++) {
			TreeNode<Integer> chlid = root.children.get(i);
			// driver code
			// printTree(root);
			printBetter(chlid);
			
		}
	}
	
	
	// function of calcution number of node in the tree
	public static int numberOfNodes(TreeNode<Integer> root) {
		// Make the count;
		int count = 1;
		// Irttring to the tree to reach all the nodes
		for(int i= 0; i<root.children.size(); i++) {
			// Using recusion
			int countInter = numberOfNodes(root.children.get(i));
			count += countInter;
			
		}
		return count;
	}
	
	// function to calculated the sum of the present node
	public static int sumOfAllNodes(TreeNode<Integer> root) {
		// Intiazing count from the root itself
		int count = root.data;
		// TRAVELLING TO THE EACH ANAD VERY NODES THPUGHTOUT THE TRAVELSAL
		for(int i = 0; i<root.children.size(); i++) {
			count += sumOfAllNodes(root.children.get(i));
			
		}
		return count;
	}
	
	
	
	
	
	// Driver Code
	public static void main( String args[]) {
		// ADDING THE ROOT 
		TreeNode<Integer> root = new TreeNode<> (4);
		TreeNode<Integer> root1 = new TreeNode<> (8);
		TreeNode<Integer> root2 = new TreeNode<> (5);
		TreeNode<Integer> root3 = new TreeNode<> (6);
		TreeNode<Integer> root4 = new TreeNode<> (4);
		TreeNode<Integer> root5 = new TreeNode<> (3);
		root.children.add(root1);
		root.children.add(root2);
		root.children.add(root3);
		root2.children.add(root4);
		root2.children.add(root5);
		// printBetter(root);
		
		// print is to be used
		// System.out.print(numberOfNodes(root));
		System.out.print(sumOfAllNodes(root));
		
	}

}
