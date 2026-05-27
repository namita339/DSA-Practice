package Stack;
import java.util.Stack;
public class area_rectangle {
	int max=0;
public int calculate(int arr[]) {
	Stack<Integer> st=new Stack<>();
	int n=arr.length;
	int nse[]=new int[n];
	nse[n-1]=-1;
	st.push(n-1);
	for(int i=n-2;i>=0;i--) {
		while(st.size()>0 && arr[i]<=arr[st.peek()]) {
			st.pop();
		}
		if(st.isEmpty()) {
			nse[i]=-1;
		}else {
			nse[i]=st.peek();
		}
		st.push(i);
	}
	st.pop();
	int pse[]=new int[n];
	st.push(0);
	pse[0]=-1;
	for(int i=1;i<n;i++) {
		while(st.size()>0 && arr[i]<=arr[st.peek()]){
			st.pop();
		}
		if(st.isEmpty()) {
			pse[i]=-1;
		}else {
			pse[i]=st.peek();
		}
		st.push(i);
	}
	for(int i=0;i<n;i++) {
		int area=arr[i]*(nse[i]-pse[i]-1);
		max=Math.max(max,area);
		
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,6,2,3};
		area_rectangle list= new area_rectangle();
	   System.out.println(list.calculate(arr));
	}

}
