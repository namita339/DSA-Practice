package array;

public class longestsubarray {

	public static void main(String[] args) {
int[] arr= {10, 5, 2, 7, 1, 9};
int k=check(arr,15);
System.out.println(k);
	}
	public static int check(int[] arr,int k) {
		int n=arr.length;
		int maxi=0;
		for(int start_index=0;start_index<n;start_index++) {
			for(int end_index=0;end_index<n;end_index++) {
				int sum=0;
				for(int i=start_index;i<=end_index;i++) {
					sum=sum+arr[i];
				}
				if(sum==k) {
					maxi=Math.max(maxi, end_index-start_index+1);
				}
			}
		}
return maxi;
}
}
