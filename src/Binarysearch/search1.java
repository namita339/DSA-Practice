package Binarysearch;

public class search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2};
		int result=rotate(arr,0);
		System.out.println(result);
		

	}
public static int rotate(int arr[],int target) {
	int n=arr.length;
	int low=0;
	int high=n-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<arr[high]) {
			if(arr[mid]<=target && target<=arr[high]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}else {
			if(arr[low]<=target && target<=arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
	}
	return -1;
	
}

}
