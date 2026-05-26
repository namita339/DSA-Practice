package Stack;

import java.util.Stack;

public class parenthesis_checker {
public boolean checker(String s) {
	Stack<Character> st=new Stack<>();
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	
		if(ch=='('|| ch=='{' || ch=='[') {
			st.push(ch);
		}else {
			if(st.isEmpty()) {
                return false;
            }

		char top=st.pop();
		if(ch==']' && top!='[') return false;
		if(ch=='}' && top!='{') return false;
		if(ch==')' && top!='(') return false;
		
	}
	
}
return st.isEmpty();

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthesis_checker obj = new parenthesis_checker();

        System.out.println(obj.checker("(){}[]"));

	}

}
