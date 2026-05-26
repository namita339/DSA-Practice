import java.util.*;
public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the size:");
		
		

	}
public static int print(int arr[]) {
	int sum=0;
	int count=0;
	int n=arr.length;
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
	}
		int avg=sum/n;
		for(int i=0;i<n;i++) {
		if(avg>arr[i]) {
			count++;
		}
	}
	return count;
}
}
