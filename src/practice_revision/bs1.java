package practice_revision;

public class bs1{
	public int first(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		int lb=-1;
		while(low <= high) {
		int mid=low+(high-low)/2;
		if(arr[mid]>=target) {
			lb=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
		}
		return lb;
	}
	public int last(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		int ub=-1;
		while(low <= high) {
		int mid=low+(high-low)/2;
		if(arr[mid]>target) {
			ub=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
		}
		return ub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,4,5};
		bs1 b=new bs1();
		
		System.out.println(	b.first(arr, 3));
		System.out.println(	b.last(arr, 3)-1);


	}

}
