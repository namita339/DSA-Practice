package array1;

public class kadane2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2, -3, -7, -2, -10, -4};
		int result=array(arr);
		System.out.println(result);

	}
public static int array(int arr[]) {
	int n=arr.length;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
		int sum=0;
		for(int j=i;j<n;j++) {
			sum=sum+arr[j];
			max=Math.max(max,sum);
		}
		
	}
	return max;
}

}
