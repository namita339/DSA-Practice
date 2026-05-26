package array;

public class linearsearch {

	public static void main(String[] args) {
int[] nums= {2,3,4,5,3};
int result=search(nums,21);
System.out.println(result);

	}
public static int search(int[] nums,int target) {
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==target) {
			return 1;
		}
	}
	return -1;
}

}
