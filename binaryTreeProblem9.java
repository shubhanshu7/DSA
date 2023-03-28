package DSA;

import java.util.Scanner;

import DSA.BinaryTree.BinaryTreeNode;

//For a given Binary Tree of type integer, update it with its corresponding mirror image.
public class binaryTreeProblem9 {
	class binaryNode<T>{
		T data;
		binaryNode<T> left;
		binaryNode<T> right;
		public binaryNode(T data) {
          this.data=data;
		}
	}
	public binaryNode<Integer> takeInput(boolean isRoot,int data,boolean leftChild){
		Scanner s=new Scanner(System.in);
		if(isRoot) {
			System.out.println("enter root node");
		}else if(leftChild) {
			System.out.println("enter left child of "+ data);
		}else {
			System.out.println("enter right child of "+ data);
		}
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		binaryNode<Integer> root=new binaryNode<Integer>(rootData);
		binaryNode<Integer> left=takeInput(false, rootData, true);
		binaryNode<Integer> right=takeInput(false, rootData, false);
        root.left=left;
        root.right=right;
        return root;
		
	}
	 public static void printTree(binaryNode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 System.out.print(root.data+": ");
		 if(root.left!=null) {
			 System.out.print("L"+root.left.data+" ");
		 }
		 if(root.right!=null) {
			 System.out.print("R"+root.right.data+" ");
		 }
		 System.out.println();
	     printTree(root.left);
		 printTree(root.right);
	 }
	public static void mirrorBinaryTree(binaryNode<Integer> root){
          if(root==null) {
        	  return;
          } 
  		System.out.println("root "+root.data);

          binaryNode<Integer> temp;
          temp=root.left;
          root.left=root.right;
          root.right=temp;
          mirrorBinaryTree(root.left);
          mirrorBinaryTree(root.right);
          
          printTree(root);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem9 b=new binaryTreeProblem9();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		mirrorBinaryTree(root);
		
	}
}
