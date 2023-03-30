package DSA;

import java.util.Scanner;
//For a given Binary Tree of type integer, print all the nodes without any siblings.
public class binaryTreeProblem8 {
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
	public static void printNodesWithoutSibling(binaryNode<Integer> root) {
		if(root==null) {
			return;
		}
		if(root.left!=null && root.right==null) {
			System.out.print(root.left.data+" ");

		}
		if(root.right!=null && root.left==null) {
			System.out.print(root.right.data+" ");
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem8 b=new binaryTreeProblem8();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
//		b.takeInput(true, 0, false);
		printNodesWithoutSibling(root);
		
		
	}
}
