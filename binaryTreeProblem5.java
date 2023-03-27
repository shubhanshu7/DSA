package DSA;

import java.util.Scanner;

import DSA.binaryTreeProblem4.binaryNode;

/*
 * Replace Node With Depth
For a given a Binary Tree of integers, replace each of its data with the depth of the tree.
Root is at depth 0, hence the root data is updated with 0. Replicate the same further going down the in the depth of the given tree.
The modified tree will be printed in the in-order fashion.
 */
public class binaryTreeProblem5 {

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
	public static binaryNode<Integer> depthK(binaryNode<Integer> root,int k) {
	       if(root==null) {
	    	   return null;
	       }
	       root.data=k;
	       depthK(root.left, k+1);
	       depthK(root.right, k+1);
	       
	       return root;
	    
		}
	public binaryNode<Integer> replaceDepth(binaryNode<Integer> root){
		if(root==null) {
			return null;
		}
	        return depthK(root, 0);
	}
	public void printInOrder(binaryNode<Integer> root) {
		if(root==null) {
			return;
		}
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem5 b=new binaryTreeProblem5();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		b.replaceDepth(root);
		System.out.println("chech  "+root.data);
		b.printInOrder(root);
	}

}
