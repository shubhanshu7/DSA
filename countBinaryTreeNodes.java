package DSA;

import java.util.Scanner;

import DSA.BinaryTree.BinaryTreeNode;

public class countBinaryTreeNodes {
	static class BinaryTreeNode<T>{
		T data;
		BinaryTreeNode<T> leftNode;
		BinaryTreeNode<T> rightNode;
		
		public BinaryTreeNode(T data) {
			this.data=data;
		}	
	}
	 public BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int data,boolean isLeft) {
		 if(isRoot) {
	         System.out.println("enter root data");
		 }else if(isLeft) {
			 System.out.println("enter left child of "+data);
		 }else {
			 System.out.println("enter right child of "+data);
		 }
         Scanner s=new Scanner(System.in);
      
         int rootData=s.nextInt();
         if(rootData==-1) {
        	 return null;
         }
	        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
	        BinaryTreeNode<Integer> left=takeInputBetter(false,rootData,true);
	        BinaryTreeNode<Integer> right=takeInputBetter(false,rootData,false);
	        root.leftNode=left;
	        root.rightNode=right;
	        return root;

 }
	 public int countNodes(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return 0;
		 }
		 
		 return countNodes(root.leftNode)+countNodes(root.rightNode)+1;
	 }
	public static void main(String[] args) {
		countBinaryTreeNodes b=new countBinaryTreeNodes();
		BinaryTreeNode<Integer> root=b.takeInputBetter(true,0,false);
        b.countNodes(root);
        System.out.println("nodes  ==> "+b.countNodes(root));
        
	}


}
