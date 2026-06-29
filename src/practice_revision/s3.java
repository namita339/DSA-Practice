package practice_revision;
import java.util.*;
public class s3 {
public int[] nextgreater(int arr[]) {
	Stack<Integer> st=new Stack<>();
	int n=arr.length;
	int nge[]=new int[n];
	nge[n-1]=-1;
	st.push(arr[n-1]);
	for(int i=n-2;i>=0;i--) {
		while(st.size()>0 && arr[i]>=st.peek()) {
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
		int arr[]= {4,5,2,25};
		s3 s=new s3();
		int nge[]=s.nextgreater(arr);
		for(int i=0;i<nge.length;i++) {
			System.out.print(nge[i]);
		}
		System.out.println();
		

	}

}
