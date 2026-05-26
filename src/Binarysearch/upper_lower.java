package Binarysearch;

public class upper_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int result=upper(arr,6);
		System.out.println(result);

	}
//public static int lower(int arr[],int target) {
	//int n=arr.length;
	//int lb=n;
	//int low=0;
	//int high=n-1;
	//while(low<=high) {
		//int mid=low+(high-low)/2;
		//if(arr[mid]>=target) {
		//	lb=mid;
		//	high=mid-1;
			
		//}
		//else {
		//	low=mid+1;
		//}
		
	//}
	//return lb;
	public static int upper(int arr[],int target) {
		int n=arr.length;
		int ub=n;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>target) {
				ub=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return ub;
}
}
