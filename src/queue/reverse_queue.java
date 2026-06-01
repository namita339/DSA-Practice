package queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class reverse_queue {
Queue<Integer> q=new LinkedList<>();
public void reverse() {
	Stack<Integer> st=new Stack<>();
	while(q.size()>0) {
		st.push(q.remove());
	}
	while(st.size()>0) {
	q.add(st.pop());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_queue obj = new reverse_queue();

		obj.q.add(10);
		obj.q.add(20);
		obj.q.add(30);
		obj.q.add(40);

		System.out.println(obj.q);

		obj.reverse();

		System.out.println(obj.q);

	}

}
