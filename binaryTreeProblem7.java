package DSA;

import java.util.Scanner;

// program to remove all the leaf node
public class binaryTreeProblem7 {


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
	public static binaryNode<Integer> removeLeaf(binaryNode<Integer> root){
	         if(root==null) {
	        	 return null;
	         }
	         if(root.left==null && root.right==null) {
	        	 return null;
	         }
	         root.left=removeLeaf(root.left);
	         root.right=removeLeaf(root.right);
	         return  root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem7 b=new binaryTreeProblem7();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		removeLeaf(root);
		
		
	}
}
