package array1;

public class sort012 {

	public static void main(String[] args) {
int arr[]= {1,0,2,1,0};
sort(arr);
for(int j=0;j<arr.length;j++) {
	System.out.println(arr[j]);
}
	}
public static void sort(int arr[]) {
	int n=arr.length;
	int count0=0;
	int count1=0;
	int  count2=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			count0++;
		}
		else if(arr[i]==1) {
			count1++;
		}
		else{
			count2++;
		}
	
	}
	int index=0;
	while(count0>0) {
		arr[index]=0;
		index++;
		count0--;
	}
	while(count1>0) {
		arr[index]=1;
		index++;
		count1--;
	}
	while(count2>0) {
		arr[index]=2;
		index++;
		count2--;
	}
	
}
}
