package Stack;
import java.util.Stack;

public class baseball {
public int  ball(String[] arr) {
	int n=arr.length;
	Stack<Integer>st=new Stack<>();
	for(int i=0;i<n;i++) {
		String s=arr[i];
		if(s.equals("C")) {
			st.pop();
		}
		else if(s.equals("D")){
			st.push(2*st.peek());
		}
		else if(s.equals("+")){
			 int a=st.pop();
			 int b=st.peek();
			 int sum=a+b;
			 st.push(a);
			 st.push(sum);
			 
			
		}
		else {
			st.push(Integer.parseInt(s));
		}
	}
		int sum=0;
		while(!st.isEmpty()) {
			
			sum=sum+st.pop();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseball o=new baseball();
		 String[] arr = {"5", "2", "C", "D", "+"};

	        System.out.println(o.ball(arr));
	}

}
