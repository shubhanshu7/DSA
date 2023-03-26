package DSA;
import java.util.*;
public class BinaryTree {

	 static class BinaryTreeNode<T>{
		T data;
		BinaryTreeNode<T> leftNode;
		BinaryTreeNode<T> rightNode;
		
		public BinaryTreeNode(T data) {
			this.data=data;
		}	
	}
	
	 public void printTree(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 System.out.print(root.data+": ");
		 if(root.leftNode!=null) {
			 System.out.print("L"+root.leftNode.data+" ");
		 }
		 if(root.rightNode!=null) {
			 System.out.print("R"+root.rightNode.data+" ");
		 }
		 System.out.println();
	     printTree(root.leftNode);
		 printTree(root.rightNode);
	 }
	// this function takes more organized input for binary tree
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
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		BinaryTreeNode<Integer> root=b.takeInputBetter(true,0,false);
        b.printTree(root);
        
	}

}
