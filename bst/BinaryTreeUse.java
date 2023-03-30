package bst;
import java.util.*;
import java.util.Scanner;

public class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of"+ parentData);
            }
        }
        System.out.println("Enter root data");
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
        root.left= leftChild;
        root.right= rightChild;
        return root;

    }

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data");
        Scanner s= new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild= takeTreeInput();
        BinaryTreeNode<Integer> rightChild= takeTreeInput();
        root.left= leftChild;
        root.right= rightChild;
        return root;

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
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

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root==null) return 0;
        int leftNodeCount= numNodes(root.left);
        int rightNodeCount= numNodes(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestLeft= largest(root.left);
        int largestRight= largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return 1;
        }
        return numLeaves(root.left)+numLeaves(root.right);
      }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
      if(root==null) {
          return null;
          }
      if(root.left==null && root.right==null) {
          return null;
          }
      root.left = removeLeaves(root.left);
      root.right = removeLeaves(root.right);
      return root;
      }

      public static int height(BinaryTreeNode<Integer> root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }

      //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
      public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
          }

      //Better time complexity O(n).
      public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
          if(root==null){
            int height= 0;
            boolean isBal= true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height= height;
            ans.isBalancedBetter= isBal;
            return ans;
          }
          BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
          BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
          boolean isBal= true;
          int height= 1+Math.max(leftOutput.height, rightOutput.height);

          if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBal= false;
          }
          if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal=false;
          }
          BalancedTreeReturn ans= new BalancedTreeReturn();
          ans.height= height;
          ans.isBalanced= isBal;
          return ans;
      }

      public static BinaryTreeNode<Integer> takeinputLevelWise(){
          Scanner s= new Scanner(System.in);
          int rootData= s.nextInt();

          if(rootData==-1) return null;

          BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
          Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
          pendingChildren.add(root);

          while(!pendingChildren.isEmpty()){
              BinaryTreeNode<Integer> front= pendingChildren.poll();
              System.out.println("Enter left child of "+ front.data);
              int left= s.nextInt();
              if(left!=-1){
                      BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                      front.left= leftChild;
                      pendingChildren.add(leftChild);
              }

              System.out.println("Enter right child of "+ front.data);
              int right= s.nextInt();
              if(right!=-1){
                      BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                      front.right= rightChild;
                      pendingChildren.add(rightChild);
              }
          }
          return root;
      }

      public static boolean searchBST(BinaryTreeNode<Integer> root, int data){
          if(root==null){
              return false;
          }
          if(root.data==data){
              return true;
          }
          if(data<root.data){
              return searchBST(root.left,data);
          }
          return searchBST(root.right, data);
      }

      public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2){
          if(root==null){
              return;
          }
          if(root.data<k1){
              printBetweenK1K2(root.right, k1, k2);
          }else if(root.data>k2){
              printBetweenK1K2(root.left, k1, k2);
          }else{
              System.out.println(root.data);
              printBetweenK1K2(root.left,k1,k2);
              printBetweenK1K2(root.right, k1,k2);
          }
      }



      public static boolean isBST(BinaryTreeNode<Integer> root){
          if(root==null){
              return true;
          }
          int leftMax= largest(root.left);
          if(leftMax>=root.data){
              return false;
          }
          int rightMin= minimum(root.right);
          if(rightMin<root.data) {
              return false;
          }
          boolean isLeftBST= isBST(root.left);
          boolean isRightBST= isBST(root.right);
          return isLeftBST && isRightBST;

      }
      public static boolean IsBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
    	  // Check if tree is empty 
    	  if(root == null) {
    		  return true;
    	  }
    	  if(root.data < minRange || root.data > maxRange) {
    		  return false;
    	  }
    	  boolean isLeftInRange = IsBST3(root.left, minRange, root.data-1);
    	  boolean isRightInRange = IsBST3(root.right,  root.data, maxRange);
    	  return isLeftInRange && isRightInRange;
      }

      public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root){
          if(root==null){
              IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
              return ans;
          }
          IsBSTReturn leftAns= isBST2(root.left);
          IsBSTReturn rightAns= isBST2(root.right);

          int min= Math.min(root.data, Math.min(leftAns.min, rightAns.min));
          int max= Math.max(root.data, Math.min(leftAns.max, rightAns.max));
          boolean isBST= true;
          if(leftAns.max>=root.data){
              isBST= false;
          }
          if(rightAns.min<root.data){
              isBST= false;
          }
          if(!leftAns.isBST){
              isBST= false;
          }
          if(rightAns.isBST){
              isBST= false;
          }
          IsBSTReturn ans = new IsBSTReturn(min,max,isBST);
          return ans;



      }


    public static void main(String[] args){

//        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
//        BinaryTreeNode<Integer> root= takeinputLevelWise();
//
//        printTreeDetailed(root);
//        System.out.println("Num nodes "+numNodes(root));
//        System.out.println("Largest is " + largest(root));
//        printAtDepthK(root,2)
//        BinaryTreeNode<Integer> newRoot= removeLeaves(root);
//        printTreeDetailed(newRoot)
//        BalancedTreeReturn ans= isBalancedBetter(root);
//        System.out.println("is balanced"+ isBalancedBetter(root).isBalanced)

          int in[]= {1,2,3,4,50,6,7};
          int pre[]={4,3,1,3,6,50,7};
          BinaryTreeNode<Integer> root= buildTreeFromPreIn(pre, in);
          printTreeDetailed(root);
        //  System.out.println(searchBST(root,30));
          IsBSTReturn ans= isBST2(root);
          System.out.println(ans.min +" "+ans.max+" "+ans.isBST);

    }

	private static BinaryTreeNode<Integer> buildTreeFromPreIn(int[] pre, int[] in) {
		// TODO Auto-generated method stub
		return null;
	}
}
