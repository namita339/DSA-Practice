package basic1;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongno(122);

	}
	public static void armstrongno(int n) {
		int sum=0;
		int last_digit;
		int original=n;
		while(n>0) {
			last_digit=n%10;
			sum=sum+last_digit*last_digit*last_digit;
			n=n/10;
		}
		if(sum==original) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
		
	}

}
