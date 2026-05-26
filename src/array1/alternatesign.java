package array1;

public class alternatesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,-5,-7,-9};
		print(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		

	}
	public static int[] print(int arr[]) {

	    int n = arr.length;

	    int pos[] = new int[n];
	    int neg[] = new int[n];

	    int p=0;
	    int ne=0;

	    for(int i=0;i<n;i++) {

	        if(arr[i]>0) {
	            pos[p]=arr[i];
	            p++;
	        }
	        else {
	            neg[ne]=arr[i];
	            ne++;
	        }
	    }

	    int i=0;
	    int j=0;
	    int k=0;

	    while(i<p && j<ne) {
	        arr[k]=pos[i];
	        k++;
	        i++;

	        arr[k]=neg[j];
	        k++;
	        j++;
	    }

	    return arr;
	}
}
