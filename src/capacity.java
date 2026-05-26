
public class capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 4, 5, 2, 3, 4, 5, 6};
		int r=capacity(arr,5);
		System.out.println(r);
		
	
	}
	public static int capacity(int arr[],int days) {
		int n=arr.length;
		int low=0;
		int high=0;
		for(int i=0;i<n;i++) {
			high+=arr[i];
		}
		int ans=high;
		while(low<=high) {
			int mid=low+(high-low)/2;
			int requiredday=ship(arr,mid);
			if(requiredday<=days) {
				ans=mid;
				high=mid-1;
				
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
public static int ship(int arr[],int capacity) {
	int n=arr.length;
	int load=0;
	int days=1;
	for(int i=0;i<n;i++) {
		if(load+arr[i]<=capacity) {
			load=load+arr[i];
		}else {
			days++;
			load=arr[i];
		}
	}
	return days;
}
}
