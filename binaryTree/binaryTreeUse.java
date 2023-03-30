package binaryTree;

import java.util.Scanner;
public class binaryTreeUse{
	
	
// Taking the Input of nodes
    public static binaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of "+ parentData);
            }
        }
        try (Scanner s = new Scanner(System.in)) {
			int rootData = s.nextInt();

			if(rootData==-1){
			    return null;
			}
			
			binaryTreeNode<Integer> root= new binaryTreeNode<Integer>(rootData);
			binaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
			binaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
			root.left= leftChild;
			root.right= rightChild;
			return root;
		}

    }
    
    
    // other way to take input as a user
    public static binaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data");
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        binaryTreeNode<Integer> root= new binaryTreeNode<Integer>(rootData);
        binaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        binaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
        return root;

    }

    
    // This function is bulid to print the tree 
    public static void printTreeDetailed(binaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data+":");
        if(root.left != null){
            System.out.print("L"+root.left.data+", ");
            }
        if(root.right != null){
            System.out.print("R"+root.right.data);
            }
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }
    
    // calculation of the total nodes
    public static int numNodes(binaryTreeNode<Integer> root) {
    	// Check the base case if the root is empty
    	if(root == null) {
    		return 0;
    	}
    	else {
    		int leftNumCount = numNodes(root.left);
    		int rightNumCount = numNodes(root.right);
    		return 1 + leftNumCount + rightNumCount;
    	}
    }
    
    //calculation of the sum of the total nodes 
    public static int getSum(binaryTreeNode<Integer> root) {
    	// checking the base case
    	if(root == null) {
    		return 0;
    	}
    	int sum = root.data;
    	// Calcuting the total left side nodes sum using recursion
    	int sumLeft = getSum(root.left);
    	//updating the total sum
    	sum += sumLeft;
    	int sumRight = getSum(root.right);
    	sum += sumRight;
    	return sum;
    }
  
    
    
    // PostTravesal of the tree
    public static int postTran(binaryTreeNode<Integer> root) {
    	// checking the base case
    	if(root== null) {
    		return 0;
    	}
    	postTran(root.left);
    	postTran(root.right);
    	System.out.println("PostTravesal of nodes :" + root.data + " ");
		return 0;
    }
    
    // preTravesal of the Tree
    private static int preTran(binaryTreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		System.out.println("Pretravesal of nodes :" + root.data + " ");
		preTran(root.left);
		preTran(root.right);
		return 0;
	}

    public static int largest(binaryTreeNode<Integer> root) {
    	// checking the base case
    	if(root== null) {
    		return -1;
    		
    	}
    	int largestLeft = largest(root.left);
    	int largestRight = largest(root.right);
    	// Using math fuction to idenfied the max of among them
    	return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    
    
    // height of the tree
    public static int height(binaryTreeNode<Integer> root) {
    	// checking the base case 
    	if(root == null) {
    		return 0;
    	}
    	int leftCout = height(root.left);
    	int rightCout = height(root.right);
    	if(leftCout > rightCout) {
    		return leftCout + 1;
    	}
    		else {
    			return rightCout +1 ;
    		
    	}
    }
    
    // number of leafs presents in the tree
    // function of check it  
    public static int numLeafs(binaryTreeNode<Integer> root) {
    	// check if the tree is empty 
    	if(root == null) {
    		return 0;
    	}
    	// check if the root's left and right child has any perents 
    	if(root.left == null && root.right == null) {
    		return 1;
    	}else {
    		return numLeafs(root.left) + numLeafs(root.right);
    	}
    }
    // Depth the nodes in that current tree
    public static void depthK(binaryTreeNode <Integer> root, int k) {
    	// checking the base case
    	if(root == null) {
    		return;
    	}
    	// checking if k is not given 
    	if(k == 0) {
    		System.out.println(root.data);
    		return;
    	}else {
    		depthK(root.left, k-1);
        	depthK(root.right , k-1);
    		
    	}
            
    	}
    
    // Check if node is present on the list
    	private static boolean isNodePresent(binaryTreeNode<Integer> root, int k) {
    		// TODO Auto-generated method stub
    		if (root==null)
            {
                return false;
            }
            
            if (root.data==k)
            {
                return true;
            }
            else
            {
                return (isNodePresent(root.left,k)||isNodePresent(root.right,k));
            }
    	}

    	// Check the nodes with silibings
    	public static void printNodesWithoutSibling(binaryTreeNode<Integer> root) {
    		//Your code goes here
            if (root==null)
            {
                return; 
            }
            
            if (root.left==null && root.right==null)
            {
                return;
            }
            
            if (root.left==null)
            {
                System.out.print(root.right.data+" ");
                printNodesWithoutSibling(root.right);
            }
            else if (root.right==null)
            {
                System.out.print(root.left.data+" ");
                printNodesWithoutSibling(root.left);
                
            }
            else
            {
                printNodesWithoutSibling(root.left);
                printNodesWithoutSibling(root.right);
            }
    	}
    	
    // This function will remove all the leaf nodes from a tree		
    public static binaryTreeNode<Integer> removeNode(binaryTreeNode<Integer> root){
    	// Checking the base case(O(1)
    	if(root == null) {
    		return null;
    	}
    	// check if the root node has one or more leafs
    	if(root.left == null && root.right == null) {
    		return null;
    	}
    	root.left = removeNode(root.left);
    	root.right= removeNode(root.right);
    	return root;
    }
    public static void main(String[] args){
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right= rootRight;
//
//
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//
//        rootLeft.right= twoRight;
//        rootRight.left= threeLeft;
 
// take Input in a effient way driver code
        binaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
        // print the input in a effiecent way driver code
        printTreeDetailed(root);
        //driver code for count of the total nodes
        System.out.println("num of nodes counts :" + numNodes(root));
        System.out.println("sum of total nodes:" + getSum(root));
        postTran(root);
        preTran(root);
        System.out.println("Largest among them is:" + largest(root));
        System.out.println("height of the tree is :" + height(root));
        System.out.println("Number of presnt leafs :" + numLeafs(root));
        System.out.println("print at depth k :");
        depthK(root, 2);
        System.out.println("Node present at:" + isNodePresent(root, 7));
        printNodesWithoutSibling(root);
        binaryTreeNode <Integer> newNode = removeNode(root);
        printTreeDetailed(newNode);
        
    }


	

	
}
