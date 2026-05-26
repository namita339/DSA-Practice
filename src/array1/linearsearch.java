package array1;

public class linearsearch {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,9,10};
		linear(arr);
	}
public static void linear(int arr[]) {
	int n=arr.length;
	int key=10;
	for(int i=0;i<n;i++) {
		if(arr[i]==key) {
			System.out.println("element found at:"+i);
		}
	}
	
}
}
