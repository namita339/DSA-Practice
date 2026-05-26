package recursion;

public class sumdigit {

	public static void main(String[] args) {
int result=sumd(12342);
System.out.println(result);
	}
	public static int sumd(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumd(n/10);
		
	}

}
