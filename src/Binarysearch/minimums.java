package Binarysearch;

public class minimums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2,3};
		int result=mini(arr);
		System.out.println(result);

	}
public static int mini(int arr[]) {
	int n=arr.length;
	int low=0;
	int high=n-1;
	int min=Integer.MAX_VALUE;
	while(low<=high) {
		 if (arr[low] <= arr[high]) {
	            min = Math.min(min, arr[low]);
	            break;
	        }
		int mid=low+(high-low)/2;
		if(arr[mid]<=arr[high]) {
			min=Math.min(min, arr[mid]);
			high=mid-1;
		}else {
			min=Math.min(min, arr[low]);
			low=mid+1;
		}
	}
	return min;
}
}
