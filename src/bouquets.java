
public class bouquets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7, 7, 7, 7, 13, 11, 12, 7};
		int m=2;
		int k=3;
		int r=min_day(arr,m,k);
		System.out.println(r);

	}
	public static int bouquet(int arr[],int k,int day) {
		int n=arr.length;
		int count=0;
		int bouquet=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=day) {
				count++;
			
			if(count==k) {
				bouquet++;
				count=0;
				}
			}else {
				count=0;
			}
			
		}
		return bouquet;
	}
public static int min_day(int arr[],int m,int k) {
	int n=arr.length;
	int low= Integer.MAX_VALUE;
	int high= Integer.MIN_VALUE;;
	for(int i =0;i<n;i++) {
		low=Math.min(low, arr[i]);
		high=Math.max(high, arr[i]);
	}
	int ans=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		int bouquet = bouquet(arr, k, mid);
		if(bouquet>=m) {
			ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}

	}
	return ans;
}
}
