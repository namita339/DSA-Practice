package practice_revision;
import java.util.*;
public class q3 {
	Stack<Integer> st1=new Stack<>();
	Stack<Integer> st2=new Stack<>();

	public void push(int val) {
		st1.push(val);
	}
	public void pop() {
		 if (st1.isEmpty() && st2.isEmpty()) {
	            System.out.println("Queue is Empty");
	            return;
	        }
		while(st1.size()>1) {
			st2.push(st1.pop());
		}
		st1.pop();
		while(st2.size()>0) {
			st1.push(st2.pop());
		}
	}
	public void peek() {
		while(st1.size()>1) {
			st2.push(st1.pop());
		}
		st1.peek();
		while(st2.size()>0) {
			st1.push(st2.pop());
		}
	}
	public void display() {
		for(int i=0;i<st1.size();i++) {
			System.out.println(st1.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q3 q=new q3();
		q.push(3);
		q.push(7);
		q.push(79);
		q.display();
		q.pop();
		q.display();
		
		

	}

}
