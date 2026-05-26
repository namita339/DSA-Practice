package array1;

public class consecutiveone {

	public static void main(String[] args) {
		int arr[]= {1,1,0,1,1,1};
		ones(arr);
	}
public static void ones(int arr[]) {
	int count=0;
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
			max=Math.max(count,max);
		}else {
			count=0;//because count is increment hen consecutive one is found if not found set to 0
		}
	}
	System.out.println("the number of consecutive ones:"+max);
}
}
