package Binarysearch;

public class search2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
		int result=rotate(arr,3);
		System.out.println(result);

	}
	public static int rotate(int arr[],int target) {
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[low]==arr[high]) {
				low++;
				high--;
				continue;
			}
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<=arr[high]) {
				if(arr[mid]<=target && target<=arr[high]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
				
			}else {
				if(arr[low]<=target&&target<=arr[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}
		}
		return -1;
	}

}
