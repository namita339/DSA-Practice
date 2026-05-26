package recursion1;

public class name {

	public static void main(String[] args) {
name(5);
	}
	public static void name(int n) {
	if(n==0) {
		return;
	}
	 System.out.println("Namita");

     name(n-1);
	
		
	}

}
