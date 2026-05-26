package Stack;
import java.util.*;
public class basic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(20);
		st.push(40);
		st.push(90);
		st.push(80);
		System.out.println(st);
		st.pop();
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.isEmpty());

	}

}
