
public class smalldivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,2,3};
		int r=divisor(arr,10);
		System.out.println(r);

	}
public static int divisor(int arr[],int limit) {
	int n=arr.length;
	int low=1;
	int high=0;
	for(int i=0;i<n;i++) {
		high=Math.max(high, arr[i]);
	}
	int ans=high;
	while(low<=high) {
		int mid=low+(high-low)/2;
		int total=0;
		for(int i=0;i<n;i++) {
			total=total+(arr[i]+mid-1)/mid;
		}
		if(total<=limit) {
			ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return ans;
}
}
