package DSA;

import java.util.Scanner;

public class BST {

	class binaryTreeNode{
		int data;
		binaryTreeNode left;
		binaryTreeNode right;
		public binaryTreeNode(int data) {
            this.data=data;
            
		}
	}
	public binaryTreeNode takeInput(boolean isRoot,int data,boolean leftChild) {
	    	if(isRoot) {
	    		System.out.println("enter root data");
	    	}else if(leftChild) {
	    		System.out.println("enter left child of "+ data);
	    	}else {
	    		System.out.println("enter right child of "+data);
	    	}
	    	
	    	Scanner s=new Scanner(System.in);
	    	int rootData=s.nextInt();
	    	if(rootData==-1) {
	    		return null;
	    	}
	    	binaryTreeNode root=new binaryTreeNode(rootData);
	    	binaryTreeNode left=takeInput(false, rootData, true);
	    	binaryTreeNode right=takeInput(false, rootData, false);
            root.left=left;
            root.right=right;
	    	return root;
	
	}
	public static boolean searchInBST(binaryTreeNode root, int k) {

		if(root==null) {
			return false;
		}
		if(root.data==k) {
			return true;
		}
		if(k<root.data) {
		return searchInBST(root.left, k); 
		}
		return	searchInBST(root.right, k);
		
	}
//	Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
	public static void elementsInRangeK1K2(binaryTreeNode root, int k1, int k2) {

		  if (root == null) {
		        return;
		    }
		    
		    // Traverse the left subtree, printing the elements in range in increasing order
		    elementsInRangeK1K2(root.left, k1, k2);
		    
		    // If root's data is in the range, print it
		    if (root.data >= k1 && root.data <= k2) {
		        System.out.print(root.data + " ");
		    }
		    
		    // Traverse the right subtree, printing the elements in range in increasing order
		    elementsInRangeK1K2(root.right, k1, k2);
	}
	
	public static void main(String[] args) {
		BST b =new BST();
		binaryTreeNode root=b.takeInput(true, 0, false);
//		System.out.println(searchInBST(root, 3));
		elementsInRangeK1K2(root, 4, 6);

	}

}
