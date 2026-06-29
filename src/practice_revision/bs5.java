package practice_revision;

public class bs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 2, 2, 3, 4, 5};
		int first=System.out.println(first(arr,2));

	}
	public int first(int arr[],int target) {
		int l=0;
		int h=arr.length-1;
		int lb=-1;
		while(l<h) {
			int mid=l+(h-l)/2;
			if(arr[mid]<=target) {
				lb=mid;
				h=mid-1;
			}else {
				l=mid+1;
				
			}
		}
		return lb;
	}
	public int lat(int arr[],int target) {
		int l=0;
		int h=arr.length-1;
		int ub=-1;
		while(l<h) {
			int mid=l+(h-l)/2;
			if(arr[mid]<target) {
				ub=mid;
				h=mid-1;
			}else {
				l=mid+1;
				
			}
		}
		return ub;
	}
}
