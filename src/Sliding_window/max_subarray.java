package Sliding_window;

public class max_subarray {
public int max(int arr[],int k) {
	int l=0;
	int r=0;
	int max=0;
	int sum=0;
	while(r<arr.length) {
		sum=sum+arr[r];
		while(sum>k) {
			sum=sum-arr[l];
			l++;
		}
		
			max=Math.max(max, r-l+1);
			r++;
		
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,10,10};
		max_subarray ms=new max_subarray();
		System.out.println(ms.max(arr,14));

	}

}
