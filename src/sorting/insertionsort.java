package sorting;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,75,3,1};
		insertion(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}
	public static void insertion(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key ) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
