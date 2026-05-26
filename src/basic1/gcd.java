package basic1;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
gcdno();
	}
	public static void gcdno() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the first no.:");
int n1=sc.nextInt();
System.out.println("enter the second no.");
int n2=sc.nextInt();
int gcd=1;
for(int i=1;i<=n1&& i<=n2;i++) {
	if(n1%i==0&& n2%i==0) {
	gcd=i;
	}
}
System.out.println(gcd);
		
		
	}

}
