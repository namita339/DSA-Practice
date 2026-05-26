package array1;

public class largest {

	public static void main(String[] args) {
	int arr[]= {2,5,1,3,0};
	int max= largest1(arr);
	System.out.println(max);

	}
public static int largest1(int arr[]) {
	int n=arr.length;
	int max=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
}

