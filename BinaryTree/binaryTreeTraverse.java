package DSA;

import java.util.Scanner;

public class binaryTreeTraverse {

	 class binaryNode<T>{
		T data;
		binaryNode<T> left;
		binaryNode<T> right;
		public binaryNode(T data) {
			this.data=data;
		}
	}
	public binaryNode<Integer> takeInput(boolean isRoot,int data,boolean leftChild) {
		Scanner s=new Scanner(System.in);
		if(isRoot) {
			System.out.println("enter root node");
		}else if(leftChild){
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
	/*
	 * Algorithm Preorder(root)
       Visit the root.
       Traverse the left subtree, i.e., call Preorder(left->subtree)
       Traverse the right subtree, i.e., call Preorder(right->subtree) 
	 */
	public void preOrder(binaryNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	/*
	 * Algorithm Postorder(root)
       Traverse the left subtree, i.e., call Postorder(left->subtree)
       Traverse the right subtree, i.e., call Postorder(right->subtree)
       Visit the root
	 */
	public void postOrder(binaryNode<Integer> root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	/*
	 * Algorithm Inorder(tree)
       Traverse the left subtree, i.e., call Inorder(left->subtree)
       Visit the root.
       Traverse the right subtree, i.e., call Inorder(right->subtree)
	 */
	public void inOrder(binaryNode<Integer> root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args) {

		binaryTreeTraverse b=new binaryTreeTraverse();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
		b.preOrder(root);
		b.postOrder(root);
		b.inOrder(root);


	}

}
