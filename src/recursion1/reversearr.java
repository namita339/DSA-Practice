package recursion1;

public class reversearr {

	public static void main(String[] args) {
		int arr[]= {23,4,5,6,7,8};
		reverse(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}
	public static void reverse(int arr[],int left,int right) {
		if(left>=right) {
			return;
		}
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		reverse(arr,left+1,right-1);
		
	}

}
