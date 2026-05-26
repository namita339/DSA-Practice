package array;

public class zeroend {

	public static void main(String[] args) {
int arr[]= {2,9,8,5,0,5,0,0};
move(arr);
for(int r=0;r<arr.length;r++) {
	System.out.println(arr[r]);
}
	}
public static int[] move(int arr[]) {
	int n=arr.length;
	int[] numbers=new int[arr.length];
	int j=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			numbers[j]=arr[i];
			j++;
		}
	}
	for (int i = 0; i < arr.length; i++) {
        arr[i] = numbers[i];
    }
return arr;
}
}
