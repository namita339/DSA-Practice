package array1;

public class alternatesign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,-4,-1,-7};
		int[] result=print(arr);
		for(int i=0;i<result.length;i++) {
		    System.out.print(result[i] + " ");
		}
		

	}
	public static int[] print(int arr[]) {

	    int n = arr.length;
	    int result[] = new int[n];

	    int po = 0;
	    int ne = 1;

	    for(int i=0;i<n;i++) {

	        if(arr[i] > 0) {
	            result[po] = arr[i];
	            po = po + 2;
	        }
	        else {
	            result[ne] = arr[i];
	            ne = ne + 2;
	        }
	    }

	    return result;
	}
}

