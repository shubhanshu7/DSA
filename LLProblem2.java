package DSA;
/*
You have been given a singly linked list of integers where the elements are sorted in ascending order. Write a function that removes the consecutive duplicate values such that the given list only contains unique elements and returns the head to the updated list.
*/
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class LLProblem2 {

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput(); 
            LLProblem2 ll=new LLProblem2();
            head = ll.removeDuplicates(head);
            print(head);

            t -= 1;
        }
        
    }
	public LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    if(head==null) {
    	return head;
    }
    LinkedListNode<Integer> current =head;
	   while(current.next!=null) {
		   if(current.data==current.next.data) {
			   current.next=current.next.next;
//			   delete(current);
		   }else {
		   current=current.next;
		   }
	   }
	   return head;
	}


}
