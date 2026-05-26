import java.util.*;
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		movezero(arr);

		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}

	}
public static void movezero(int arr[]) {
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
	}
	
}
}
