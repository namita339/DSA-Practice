package array1;

public class numberonce {

	public static void main(String[] args) {
		int arr[]= {2,3,5,3,5,6,7,7,6};
		int num=number(arr);
		System.out.println("the unique element is:"+num);
	}
public static int number(int arr[]) {
	int n=arr.length;
	int count=0;
	for(int i=0;i<n;i++) {
		int num=arr[i];
		for(int j=0;j<n;j++) {
			if(arr[j]==num) {
				count++;
			}
			if(count==1) {
				return num;
			}
		}
	}
	return -1;
}
}
