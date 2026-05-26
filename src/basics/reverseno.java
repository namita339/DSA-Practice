package basics;

public class reverseno {

	public static void main(String[] args) {
		reverse();

	}
public static void reverse() {
	int n=121;
	int original=n;
	int temp=0;
	while(n>0) {
		int digit=n%10;
		temp=temp*10+digit;
		n=n/10;
	}
	if(temp==original) {
	System.out.println("the number is palindrome");
}
	else {
		System.out.println("number is not palindrome");
	}
}
}
