package DSA;


// reverse of a Linked List
import java.util.LinkedList;

public class LLProblem5 {
 
	  Node head;
	
	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
   
     LLProblem5 l=new LLProblem5();
     l.addFirst(1);
     l.addFirst(2);
     l.addFirst(3);
     l.display(l.head);

      Node headr=l.reverse(l.head);
     l.display(headr);
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		
	}
	public void display(Node head) {
		if(head==null) {
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public Node reverse(Node head) {
		Node prev=null;
		Node current =head;
		Node nextNode=null;
		while(current!=null) {
			 nextNode=current.next;
			current.next=prev;
			prev=current;
			current=nextNode;
		}
	head=prev;
	return head;
	}

}
