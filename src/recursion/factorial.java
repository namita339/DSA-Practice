package recursion;

public class factorial {

	public static void main(String[] args) {
int result=facto(5);
System.out.println(result);
	}
public static int facto(int n) {
	if(n==0) {
		return 1;
	}
	return n*facto(n-1);
	
}
}
