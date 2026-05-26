
public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,5};
		code(arr);

	}
public static void code(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		if(arr[i]==arr[i+1]) {
			System.out.println("the code is INVALID" +i);
		}else {
			System.out.println("valid");
		}
	}
}
}
