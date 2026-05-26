package array1;

public class kadane1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 5, -2, 7, -4};
		int result=sort(arr);
		System.out.println(result);

	}
public static int sort(int arr[]) {
	int n=arr.length;
	int max=0;
	for(int i=0;i<n;i++) {
		for(int j=i;j<=n;j++) {
			int sum=0;
			for(int k=i;k<j;k++) {
				sum=sum+arr[k];
				max=Math.max(max, sum);
			}
		}
	}
	return max;
}
}
