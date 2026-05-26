package array1;

public class leaderarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,12,3,0,6};
		leader(arr);
		int arr1[]= {10,22,12,3,0,6};
		optimal(arr1);
	
		
	}
public static void leader(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		boolean leader=true;
		for(int j=i+1;j<n;j++) {
			if(arr[j]>arr[i]) {
				leader=false;
			}

		}
		 if(leader==true) {
	          System.out.println(arr[i]);
	      }
	}

}
public static void optimal(int arr1[]) {
	int n=arr1.length;
	int max=Integer.MIN_VALUE;
	for(int i=n-1;i>=0;i--) {
		if(arr1[i]>max) {
			System.out.println(arr1[i]);
			max=arr1[i];
		}
	}
	
}
}
