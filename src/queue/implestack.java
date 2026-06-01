package queue;
import java.util.Stack;
public class implestack {
	Stack<Integer> st=new Stack<>();
Stack<Integer> st2=new Stack<>();
public void push(int val) {
	st.push(val);
}
public int pop() {
	while(st.size()>1) {
		st2.push(st.pop());
	}
	int p =st.pop();
	while(!st2.isEmpty()) {
		st.push(st2.pop());
	}
	return p;
}
public int peek() {
	while(st.size()>1) {
		st2.push(st.pop());
	}
	int r=st.peek();
	while(!st2.isEmpty()) {
		st.push(st2.pop());
	}
	return r;
	
}
public void display() {
	for(int i=0;i<st.size();i++) {
		System.out.println(st.get(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implestack q=new implestack();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		
		
		q.pop();
		q.display();

	}

}
