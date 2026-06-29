package practice_revision;
import java.util.*;
public class s6 {
public int rectangle_area(int arr[]) {
	Stack<Integer> st=new Stack<>();
	int n=arr.length;
	int nse[]=new int[n];
	int pse[]=new int[n];
	st.push(n-1);
	nse[n-1]=n;

	for(int i=n-2;i>=0;i--) {
		while(st.size()>0 && arr[i]<=arr[st.peek()]) {
			st.pop();
		}
		if(st.isEmpty()) {
			nse[i]=n;
		}else {
			nse[i]=st.peek();
		}
		st.push(i);
	}
	st.clear();
	pse[0]=-1;
	st.push(0);
	for(int i=1;i<n;i++) {
		while(st.size()>0 && arr[i]<=st.peek()) {
			st.pop();
		}
		if(st.isEmpty()) {
			pse[i]=-1;
		}else {
			pse[i]=st.peek();
		}
		st.push(i);
	}
	int max=0;
	for(int i=0;i<n;i++) {
		int breadth=nse[i]-pse[i];
		int area=arr[i]*breadth;
		max=Math.max(max, area);
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 6, 2, 3, 1};
        s6 obj = new s6();
        System.out.println("The largest area in the histogram is " + obj.rectangle_area(arr));
    }

	}


