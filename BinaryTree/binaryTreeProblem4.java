package DSA;

import java.util.Scanner;

import DSA.binaryTreeProblem3.binaryNode;
// print all node at depth k
public class binaryTreeProblem4 {

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
	public static void depthK(binaryNode<Integer> root,int k) {
       if(root==null) {
    	   return;
       }
       if(k==0) {
    	   System.out.print(root.data+" ");
       }
       depthK(root.left, k-1);
       depthK(root.right, k-1);
    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryTreeProblem4 b=new binaryTreeProblem4();
		binaryNode<Integer> root= b.takeInput(true, 0, false);
//		System.out.println(depthK(root,1));
		depthK(root, 1);
	}
}
