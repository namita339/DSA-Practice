package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int arr[]= {7,5,9,2,8};
		selection(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}
public static void selection(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
}
}
