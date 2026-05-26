package array1;

public class move0end {

	public static void main(String[] args) {
		int arr[]= {9,7,0,5,8,0,3};
		int result[]= move(arr);
		 for(int i=0;i<result.length;i++) {
	            System.out.println(result[i]);
	        }
	}
public static int[] move(int arr[]) {
	int n=arr.length;
	int temp[]=new int[n];
	int index=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			temp[index]=arr[i];
			index++;
		}
	}
	for(int i=0;i<n;i++) {
		arr[i]=temp[i];
	}
	return arr;
}
}
