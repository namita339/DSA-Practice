package array1;

public class secondlar {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,28,90};
		int sec_lar=secondlargest(arr);
		System.out.println("the second largest is:"+sec_lar);

	}
public static int secondlargest(int arr[]){
	int max=arr[0];
	int sec_lar=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>sec_lar && arr[i]!=max) {
			sec_lar=arr[i];
		}
	}
	return sec_lar;
	
}
}
