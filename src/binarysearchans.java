
public class binarysearchans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=square(35);
		System.out.println(result);

	}
public static int square(int n) {
	int low=1;
	int high=n;
	int ans=-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if((mid*mid)<=n) {
		ans=mid;
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return ans;
}
}
