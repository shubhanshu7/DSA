package DSA;

import java.util.Scanner;

import DSA.binaryTreeProblem2.binaryNode;

public class binaryTreeProblem3 {


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
	public static int numLeaves(binaryNode<Integer> root) {
       if(root==null) {
    	   return 0;
       }
      if(root.left==null && root.right==null) {
    	  return 1;
      }
      return numLeaves(root.left)+numLeaves(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem3 b=new binaryTreeProblem3();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		System.out.println(numLeaves(root));
	}

	
}
