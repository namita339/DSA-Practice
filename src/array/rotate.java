package array;

import java.util.Arrays;

public class rotate {

	public static void main(String[] args) {
int[] arr= {2,4,5,6,7,8,9};
leftrotate(arr);
System.out.println("After Left Rotate:");
for(int k=0;k<arr.length;k++) {
	System.out.println(arr[k]);
}
System.out.println();
rightrotate(arr);
System.out.println("After Right Rotate:");
for(int r=0;r<arr.length;r++) {
	System.out.println(arr[r]);
}

	}
public static void leftrotate(int[] arr) {
	int temp=arr[0];
	int n=arr.length;
	for(int i=1;i<n;i++) {
		arr[i-1]=arr[i];
	}
	arr[n-1]=temp;
}
public static void rightrotate(int[] arr) {
	int n=arr.length;
	int temp=arr[n-1];
	for(int i=n-1;i>0;i--) {
		arr[i]=arr[i-1];
	}
	arr[0]=temp;
}
}
