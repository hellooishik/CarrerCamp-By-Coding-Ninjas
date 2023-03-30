package BinarySearchTree;

public class BST{

    private BinaryTreeNode<Integer> root;
    private int size;

    public static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        if(x<node.data){
            return isPresentHelper(node.left,x);
        }else{
            return isPresentHelper(node.right, x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

    public void insert(int x){
        root= insert(root,x);
        size++;

    }

    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x){
        if(root==null)
            return new BSTDeleteReturn(null, false);
        if(root.data<x){
            BSTDeleteReturn outpurRight= deleteDataHelper(root.right,x);
            root.right=outputRight.root;
            outputRight.root= root;
            return outpurRight;
         }
         if(root.data>x){
             BSTDeleteReturn outpurLeft= deleteDataHelper(root.left,x);
             root.left=outputLeft.root;
             outputLeft.root= root;
             return outpurLeft;
          }

          //0 children
          if(root.left == null && root.right==null)
              return new BSTDeleteReturn(null, true);

          //only left child
          if(root.left != null && root.right==null)
              return new BSTDeleteReturn(root.left, true);

          //only right child
          if(root.left == null && root.right!=null)
              return new BSTDeleteReturn(root.right, true);

          //both children present
          int rightMax=  largest(root.right);
          root.data= rightMax;
          BSTDeleteReturn outputRight= deleteDataHelper(root.right, rightMax);
          root.right= outputRight.root;
          return new BSTDeleteReturn(root.roght, true);


    }

    public boolean deleteData(int x){
        BSTDeleteReturn output= deleteDataHelper(root,x);
        root= output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }

    public int size(){
        return size;
    }
    public void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node == null){
            return;
        }
        System.out.println(node.data+":");
        if(node.left != null){
            System.out.print("L"+node.left.data+", ");
            }
        if(node.right != null){
            System.out.print("R"+node.right.data);
            }
        System.out.println();

        printTree(node.left);
        printTree(node.right);

    }
}

