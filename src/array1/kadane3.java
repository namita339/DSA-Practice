package array1;

public class kadane3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-2, -3, -7, -2, -10, -4};
		int result=array(arr);
		System.out.println(result);

	}
public static int array(int arr[]) {
	int n=arr.length;
	int max=Integer.MIN_VALUE;//to handle negative value that hy not set to 0
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		max=Math.max(max, sum);
	}
	if(sum<0) {//why to carry negative
		sum=0;
	}
	return max;
}
}
