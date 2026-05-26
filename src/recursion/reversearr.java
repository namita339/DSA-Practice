package recursion;

public class reversearr {

	public static void main(String[] args) {
int arr[]= {10,23,4,56,7,75,34};
reverse(arr,0,arr.length-1);
for(int i=0;i<=arr.length-1;i++) {
	System.out.println(arr[i]);
}
	}
public static int reverse(int arr[],int left,int right) {
	if (left>=right){
		return 0;
	}
	else {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		return reverse(arr,left+1,right-1);
	}
	
}
}
