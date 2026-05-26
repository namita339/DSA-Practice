package Stack;
import java.util.Stack;
public class remove_cons {
public void remove(String s) {
	Stack<Character> st=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(st.isEmpty()) {
			st.push(ch);
		}
		char top=st.peek();
		if(ch!=top) {
			st.push(ch);
		}
	}
	for(int i=0;i<st.size();i++) {
		System.out.println(st.get(i));
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove_cons l=new remove_cons();
		l.remove("aaabbccdd");

	}

}
