package DSA;

import java.util.*;
public class LLProblem1 {

//	Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
	public static void main(String[] args) {
    LinkedList<Integer> ll =new LinkedList<>();
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    while(i>0) {
    	ll.add(s.nextInt());
    	i--;
    }
      LLProblem1 l=new LLProblem1();
      l.cleanUp(ll);
      System.out.println(ll);
	}
 
	public void cleanUp(LinkedList<Integer> ll) {
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i)>25) {
				ll.remove(i);
			}
		}
	}
}
