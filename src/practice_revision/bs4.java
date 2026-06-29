package practice_revision;

public class bs4 {
	public int peak(int arr[]) {

	    int low = 0;
	    int high = arr.length - 1;

	    while(low < high) {

	        int mid = low + (high - low) / 2;

	        if(arr[mid] < arr[mid + 1]) {
	            low = mid + 1;
	        } else {
	            high = mid;
	        }
	    }

	    return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 4, 2};
		bs4 b=new bs4();
		System.out.println(b.peak(arr));

	}

}
