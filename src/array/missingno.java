package array;

public class missingno {

	public static void main(String[] args) {
int[] arr= {1,3,2,5};
int ans=number(arr);
System.out.println(ans);
}
public static int number(int[] arr) {
	int n=arr.length;
	for(int i=1;i<=n;i++) {
		boolean found=false;
		for(int j=0;j<n-1;j++) {
			if(arr[j]==i) {
				found=true;
				break;
			}
		}
			if(!found)
				return i;
		
	}
	
return -1;
	}
}
