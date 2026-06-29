package practice_revision;
import java.util.*;
public class q4 {
	Queue<Integer> q=new LinkedList<>();
	Stack<Integer> st=new  Stack<>();
	public void push(int val) {
		q.add(val);
	}
public void reverse_queue() {
	while(q.size()>0) {
		st.push(q.remove());
	}
	while(!st.isEmpty()) {
		System.out.print(st.pop());
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 q4 q=new q4();
		 q.push(10);
		 q.push(20);
		 q.push(30);
		 q.push(40);
		 q.push(50);
		 q.reverse_queue();

	}

}
