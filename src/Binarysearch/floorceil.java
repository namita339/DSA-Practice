package Binarysearch;

public class floorceil {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};

	    int f = floor(arr, 5);
	    int c = ceil(arr, 5);

	    System.out.println("Floor: " + f);
	    System.out.println("Ceil: " + c);
	}

	public static int floor(int arr[], int target) {
		int n = arr.length;
		int f = -1;   // store value
		int low = 0;
		int high = n - 1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(arr[mid] <= target) {
				f = arr[mid];   // ✅ store value
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return f;
	}

	public static int ceil(int arr[], int target) {
		int n = arr.length;
		int c = -1;   // store value
		int low = 0;
		int high = n - 1;

		while(low <= high) {
			int mid = low + (high - low) / 2;

			if(arr[mid] >= target) {
				c = arr[mid];   // ✅ store value
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return c;   // ✅ inside function
	}
}
