package DSA;


public class singlyLinkedList {
	private Node head;
	private Node tail;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
        head=newNode;
    }
	
     public void addLast(int data) {
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

     public void deleteFirst() {
	    if(head==null) {
	    	System.out.println("list is empty");
	    	return;
	    }
	    head=head.next;
     }

     public void deleteLast() {
	   if(head==null) {
    	System.out.println("list is empty");
    	return;
     }
	   Node lastNode=head.next;
	   Node secondLast=head;
	   while(lastNode.next!=null) {
		   
		   lastNode=lastNode.next;
		   secondLast=secondLast.next;
	   }
	   secondLast.next=null;
    }
public void display() {
	if(head==null) {
		System.out.println("linked list is empty");
		return;
	}
	Node current=head;
	while(current!=null) {
		System.out.println("data-> "+current.data);
		current=current.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlyLinkedList s=new singlyLinkedList();
        s.addFirst(5);
        s.addFirst(4);
        s.addLast(6);
        s.addLast(7);
        s.deleteFirst();
        s.deleteLast();
        s.display();
	}

}
