package array1;

public class kadansubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 5, -2, 7, -4};
		int result=array(arr);
System.out.println(result);
	}
public static int array(int arr[]) {
	int n=arr.length;
	int max=Integer.MIN_VALUE;
	int start=0;
	int ansstart=-1;
	int ansend=-1;
	int sum=0;
	for(int i=0;i<n;i++) {
		if(sum==0) {
			start=i;
		}
		sum=sum+arr[i];
		if(sum<0){
		    sum=0;
		}
		if(sum>max) {
			max=sum;
			ansstart=start;
			ansend=i;
		}
	}
	for(int k=ansstart;k<=ansend;k++) {
		System.out.println(arr[k]);
	}
	return max;
}
}
