package DSA;


public class stackUsingArray {
	 private int topIndex;
	 private int data[];

		public stackUsingArray() {
          data=new int[10];
          topIndex=-1;
		}
	public void push(int n) {
		if(topIndex==data.length) {
			System.out.println("stack is full");
			return;
		}
		data[++topIndex]=n;
	}
	public int pop() {
		if(topIndex==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		int temp=data[topIndex];
		topIndex--;
		return temp;
	}
	public boolean isEmpty() {
		return topIndex==-1;
	}
	public int size() {
		return topIndex+1;
	}
	public int top() {
		if(topIndex==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		return data[topIndex];
	}

}
