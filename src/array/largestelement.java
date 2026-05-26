package array;

public class largestelement {

	public static void main(String[] args) {
int arr[]= {2300,56,12,34,5600,9,10000};
int largest=greater(arr);
System.out.println(largest);
	}
	public static int greater(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	}


