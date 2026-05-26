package array1;

public class removeduplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,3,4,4,5};
		int unique=duplicate(arr);
		System.out.println(unique);
		

	}
public static int duplicate(int arr[]) {
	int i=0;
	for(int j=1;j<arr.length;j++) {
		if(arr[i]!=arr[j]) {
			arr[i+1]=arr[j];
			i++;
		}
	}
	return i+1;
}
}
