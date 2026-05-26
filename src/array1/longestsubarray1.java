package array1;

public class longestsubarray1 {

	public static void main(String[] args) {
		int arr[]={9,-3,3,-1,6,-5};
		int result=zero(arr);
		System.out.println(result);
		

	}
public static int zero(int arr[]) {
	int n=arr.length;
	int max=0;
	for(int i=0;i<n;i++) {
		int sum=0;
		for(int j=i;j<n;j++) {
			sum=sum+arr[j];
			if(sum==0) {
				max=Math.max(max,j-i+1);
			}
		}
	}
	return max;
}
}
