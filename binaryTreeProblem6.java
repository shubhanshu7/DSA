package DSA;

import java.util.Scanner;

import DSA.binaryTreeProblem5.binaryNode;

public class binaryTreeProblem6 {


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
	
	public static boolean isNodePresent(binaryNode<Integer> root, int x) {
	    //Your code goes here
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		boolean left=isNodePresent(root.left, x);
		boolean right=isNodePresent(root.right, x);
		
		return left || right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem6 b=new binaryTreeProblem6();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		
		if(isNodePresent(root,2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
