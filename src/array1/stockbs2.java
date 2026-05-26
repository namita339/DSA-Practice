package array1;

public class stockbs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,3,6,4};
		int result=stock(arr);
		System.out.println(result);
	}
public static int stock(int arr[]) {
	int n=arr.length;
	int min_price=Integer.MAX_VALUE;
	int max_profit=0;
	for(int i=0;i<n;i++) {
		min_price=Math.min(min_price, arr[i]);
		max_profit=Math.max(max_profit, arr[i]-min_price);
	}
	return max_profit;
}
}
