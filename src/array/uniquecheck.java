package array;

public class uniquecheck {
public static void main(String args[]) {
	int[] arr= {2,34,56,2,34,56,1};
	int ans=check(arr);
	System.out.println(ans);
}
public static int check(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		int count=0;
		int num=arr[i];
		for(int j=0;j<n;j++) {
			if(arr[j]==num) {
				count++;
			}
		}
		if(count==1) {
			return num;
		}
	}
		return -1;
}
}
