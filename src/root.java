
public class root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=root2(3,27);
		System.out.println(result);

	}
	public static long calculatePower(int base, int power) {
	    long result = 1;

	    for (int i = 0; i < power; i++) {
	        result *= base;
	    }

	    return result;
	}
public static int root2(int power,int n) {
	int low=1;
	int high=n;
	
	while(low<=high) {
	int mid=low+(high-low)/2;
	 long val = calculatePower(mid, power);
	
	if(val==n) {
		return mid;
	}
	if(val<n) {
		
		low=mid+1;
	}else {
		high=mid-1;
	}
	}
	return -1;
}
}
