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
	 public BinaryTreeNode<Integer> takeInput() {
             Scanner s=new Scanner(System.in);
          
             System.out.println("enter root data");
             int rootData=s.nextInt();
             if(rootData==-1) {
            	 return null;
             }
 	        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
 	        BinaryTreeNode<Integer> left=takeInput();
 	        BinaryTreeNode<Integer> right=takeInput();
 	        root.leftNode=left;
 	        root.rightNode=right;
 	        return root;

	 }
	 
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		BinaryTreeNode<Integer> root=b.takeInput();
        b.printTree(root);
        
	}

}
