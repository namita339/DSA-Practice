package array;

public class secondlargest {

	public static void main(String[] args) {
int arr[]= {34,67,8,9,90,23,45};
int secondlargest=second(arr);
System.out.println(secondlargest);

	}
public static int second(int arr[]) {
	int largest=arr[0];
	int secondlargest=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>secondlargest && arr[i]!=largest ) {
			secondlargest=arr[i];
		}
	}
	return secondlargest;
}
}
