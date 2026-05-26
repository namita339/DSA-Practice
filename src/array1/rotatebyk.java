package array1;

public class rotatebyk {

	public static void main(String[] args) {
		int arr1[]= {1,5,2,3,6};
		leftrotate(arr1,2);
		for(int k=0;k<arr1.length;k++) {
			System.out.println(arr1[k]);
		}
		int arr2[]= {1,5,2,3,6};
		rightrotate(arr2,2);
		for(int k=0;k<arr1.length;k++) {
			System.out.println(arr2[k]);
		}
	}
public static void leftrotate(int arr1[],int k) {
	int n=arr1.length;
	int temp[]=new int[k];
	for(int i=0;i<k;i++) {
		temp[i]=arr1[i];
	}
	for(int i=k;i<n;i++) {
		arr1[i-k]=arr1[i];
	}
	int j=0;
	for(int i=n-k;i<n;i++) {
		arr1[i]=temp[j];
		j++;
	}
}
public static void rightrotate(int arr2[],int k) {
	int n=arr2.length;
	int temp[]=new int[k];
	for(int i=0;i<k;i++) {
		temp[i]=arr2[n-k+i];
	}
	for(int i=n-k-1;i>=0;i--) {
		arr2[i+k]=arr2[i];
	}
	
	for(int i=0;i<k;i++) {
		arr2[i]=temp[i];
	}
}
}
