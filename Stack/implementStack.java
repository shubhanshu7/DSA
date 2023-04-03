package DSA;

public class implementStack {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       stackUsingArray s=new stackUsingArray();
	       s.push(10);
	       s.push(20);
	       System.out.println(s.top());
	       System.out.println(s.size());

	       s.pop();
	       System.out.println(s.top());
	       s.pop();

	       System.out.println(s.isEmpty());
	       s.push(30);
		
	}

}
