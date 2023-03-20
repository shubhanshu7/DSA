package DSA;

import java.util.*;
public class singlyListPreDefined {

//	function to add element at a given index
	
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<>();
		l.add("this");
		l.add("is a");
		l.add("list");
		l.add(2, "linked");
//		l.size();
		System.out.println(l);
		String []arr=new String[l.size()];
		l.toArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
