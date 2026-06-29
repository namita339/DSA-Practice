package practice_revision;
import java.util.*;
public class s5 {
	Queue<Integer> q=new LinkedList<>();
public void push(int val) {
	q.add(val);
}
public void pop() {
	while(q.size()>1) {
		q.add(q.remove());
	}
	q.remove();
}
public void peek() {
	while(q.size()>1) {
		q.add(q.remove());
	}
	q.peek();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
