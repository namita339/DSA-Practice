package Binarysearch;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7};
int result=binary(arr,6);
System.out.println(result);
	}
public static int binary(int arr[],int target) {
	int n=arr.length;
	int low=0;
	int high=n-1;
	while(low<=high) {
	int mid = low + (high - low) / 2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(target>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return -1;
}
}
