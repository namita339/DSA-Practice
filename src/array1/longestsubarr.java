package array1;

public class longestsubarr {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,1};
		int maxlen=longest(arr,8);
		System.out.println(maxlen);
		

	}
	public static int longest(int arr[],int k) {
		int n=arr.length;
		int maxlen=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==k) {
				maxlen=Math.max(maxlen,j-i+1);
				}
			}
			
			}
		return maxlen;
		}
}
	

