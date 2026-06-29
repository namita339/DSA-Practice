package practice_revision;

public class bs7 {
	public int check(int arr[],int day) {
		int low=0; 
		int high=0;
		int ans=-1;
		for(int i=0;i<arr.length;i++)
		{
			low=Math.max(low, arr[i]);
			}
		for(int i=0;i<arr.length;i++) {
			high=high+arr[i];
		}
		while(low<=high) {
			int capacity=low+(high-low)/2;
			if(ship(arr,capacity)<=day) {
				ans=capacity;
				high=capacity-1;
			}else {
				low=capacity+1;
			}
		}
		return ans;
		}
public int ship(int arr[],int capacity) {
	int load=0;
	int day=1;
	for(int i=0;i<arr.length;i++) {
		if(load+arr[i]<=capacity) {
			load=load+arr[i];
		}else {
			day++;
			load=arr[i];
			
		}
	}
	return day;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,5,2,3,4,5,6};
		bs7 b=new bs7();
		System.out.println(b.check(arr, 5));

	}

}
