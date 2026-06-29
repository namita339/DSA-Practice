package practice_revision;

public class bs6 {
public int koko(int arr[],int hours) {
	int low=1;
	int high=0;
	int ans=-1;
	for(int i=0;i<arr.length;i++) {
		high=Math.max(high, arr[i]);
	}
	while(low<=high) {
		int mid=low+(high-low)/2;
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+(arr[i]+mid-1)/mid;
		}
		if(total<=hours) {
			 ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 6, 7, 11};
		 bs6 b=new bs6();
		 
		System.out.println(b.koko(arr, 8));
		

	}

}
