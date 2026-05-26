package array1;

public class consecutiveseq {

	public static void main(String[] args) {
		int arr[]= {101,4,200,1,3,2};
		int result=sequence(arr);
		System.out.println(result);

	}
public static boolean linearsearch(int arr[],int num) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		if(arr[i]==num) {
			return true;
		}
		
	}
	return false;
}
public static int sequence(int arr[]) {
	int n=arr.length;
	int longest=1;

	for(int i=0;i<n;i++) {
		int num=arr[i];
		int count=1;
		while(linearsearch(arr,num+1)==true) {
			num=num+1;
			count=count+1;
		}
		longest=Math.max(longest,count);
	}
	return longest;
}
}
