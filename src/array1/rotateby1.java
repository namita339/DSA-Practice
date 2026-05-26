package array1;

public class rotateby1 {

	public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7};
	leftrotate(arr);
	for(int k=0;k<arr.length;k++) {
		System.out.println(arr[k]);
	}
	rightrotate(arr);
	for(int r=0;r<arr.length;r++) {
		System.out.println(arr[r]);
	}

	}
public static void leftrotate(int arr[]) {
	int n=arr.length;
	int temp=arr[0];
	for(int i=1;i<n;i++) {
		arr[i-1]=arr[i];
	}
	arr[n-1]=temp;
}
public static void rightrotate(int arr[]) {
	int n=arr.length;
	int temp=arr[n-1];
	for(int i=n-2;i>=0;i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
}
}
