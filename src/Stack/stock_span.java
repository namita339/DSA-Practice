package Stack;
import java.util.ArrayList;
import java.util.Stack;
public class stock_span {
public ArrayList<Integer> calculatespan(int[] arr){
	Stack<Integer> st=new Stack<>();
	int n=arr.length;
	int[] span=new int[n];
	span[0]=1;
	st.push(0);
	for(int i=1;i<n;i++) {
		while(st.size()> 0 && arr[i]>=arr[st.peek()] ) {
			st.pop();
		}
		if(st.isEmpty()) {
			span[i]=i+1;
		}
		else{
			span[i]=i-st.peek();
		}
		st.push(i);
	}
	ArrayList<Integer> ans=new ArrayList<>();
	for(int i=0;i<n;i++) {
		ans.add(span[i]);
	}
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stock_span list=new stock_span();
		int arr[]= {100,60,60,67,75,85};
		System.out.print(list.calculatespan(arr));

	}

}
