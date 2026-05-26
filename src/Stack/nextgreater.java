package Stack;
import java.util.Stack;
public class nextgreater {
public int[] greater(int arr[]) {
	Stack<Integer>st=new Stack<>();
	int n=arr.length;
	int[] nge=new int[n];
	nge[n-1]=-1;
	st.push(arr[n-1]);
	for(int i=n-2;i>=0;i--) {
		while(st.size()>0 && arr[i]>st.peek()) {
			st.pop();
		}
		if(st.isEmpty()) {
			nge[i]=-1;
		}else {
		nge[i]=st.peek();
		}
		st.push(arr[i]);
	}
	return nge;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextgreater list=new nextgreater();
		int arr[]= {4,3,6,7,2};
		int ans[]=list.greater(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]);
		}
System.out.println();
	}

}
