package DSA;

import java.util.Scanner;


public class balancedBinaryTree {

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
	public static int height(binaryNode<Integer> root) {
	       if(root==null) {
	    	   return 0;
	       }
	       int left=height(root.left);
	       int right=height(root.right);

	       return 1+Math.max(left, right);
		}
	public static boolean checkBalanceTree(binaryNode<Integer> root) {
		if(root==null) {
			return true ;
		}
		int left=height(root.left);
		int right=height(root.right);
		if(Math.abs(left-right)>1) {
			return false;
		}
		boolean rightBalanced=checkBalanceTree(root.left);
		boolean leftBalanced=checkBalanceTree(root.right);
		return rightBalanced&&leftBalanced;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balancedBinaryTree b=new balancedBinaryTree();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
//		b.checkBalanceTree(root);
		System.out.println(b.checkBalanceTree(root));
	}
}
