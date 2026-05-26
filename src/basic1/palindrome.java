package basic1;

public class palindrome {

	public static void main(String[] args) {
		palindromeno(121);

	}
	public static void palindromeno(int n) {
		int temp=0;
		int original=n;
		while(n>0) {
			int last_digit=n%10;
			temp=temp*10+last_digit;
			n=n/10;
		}
		if(original==temp) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
