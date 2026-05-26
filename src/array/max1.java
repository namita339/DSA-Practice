package array;

public class max1 {

	public static void main(String[] args) {
int[] arr= {1,1,0,1,1,1};
int ans=array(arr);
System.out.println(ans);
	}
	public static int array(int[] arr) {
		int count=0;
		int max_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				count=0;
			}
			max_count=Math.max(count,max_count);
		}
		return max_count;
	}

}
