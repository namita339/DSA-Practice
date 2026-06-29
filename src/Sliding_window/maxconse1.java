package Sliding_window;

public class maxconse1 {
	public int max(int arr[],int k) {
		int left=0;
		int right=0;
		int max=0;
		int zero=0;
		while(right<arr.length) {
			if(arr[right]==0) {
				zero++;
			}
			while(zero > k) {

			    if(arr[left] == 0) {
			        zero--;
			    }

			    left++;
			}
			
			max=Math.max(max, right-left+1);
			right++;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,0,0,0,1,1,1,1,0};
		maxconse1 mc=new maxconse1();
		System.out.println(mc.max(arr,2));
		
		

	}

}
