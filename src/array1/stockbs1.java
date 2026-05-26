package array1;

public class stockbs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {7,1,5,3,6,4};
		int result=stock(price);
		System.out.println(result);

	}
public static int stock(int price[]) {
	int n=price.length;
	int max=0;
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			if(price[j]>price[i]) {
				int profit=price[j]-price[i];
				max=Math.max(max,profit);
			}
		}
	}
	return max;
}
}
