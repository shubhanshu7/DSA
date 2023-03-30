package DSA;

import java.util.Scanner;

public class binaryTreeProblem1 {
/*
 * For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.
 */
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
			System.out.println("enter root data");
		}else if(leftChild) {
			System.out.println("enter left child of "+data);
		}else {
			System.out.println("enter right child of "+data);
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
	public static int countNodesGreaterThanX(binaryNode<Integer> root, int x) {
       if(root==null) {
    	   return 0;
       }
       int count=0;
       if(root.data>x)
    	   count++;
    	   count+=countNodesGreaterThanX(root.left, x);
    	   count+=countNodesGreaterThanX(root.right, x);
       return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem1 b=new binaryTreeProblem1();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		System.out.println(countNodesGreaterThanX(root, 2));
	}

}
