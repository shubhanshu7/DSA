package DSA;

import java.util.*;
public class SearchDisplayIndex {

	 public int search(LinkedList<Integer> ll) {
		 int i=0;
		for(i=0;i<ll.size();i++) {
			if(ll.get(i)==7) {
				return i;
			}
		}
		 return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> ll =new LinkedList<>();
		ll.add(1);
		ll.add(5);
//		ll.add(7);
		ll.add(3);
		ll.add(8);
		ll.add(2);
		ll.add(7); 
	
        SearchDisplayIndex s=new SearchDisplayIndex();
        System.out.println(s.search(ll));
	}

}
