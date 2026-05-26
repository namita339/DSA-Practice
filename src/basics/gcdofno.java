package basics;

import java.util.Scanner;

public class gcdofno {

	public static void main(String[] args) {
	gcd();

	}
	public static void gcd() {
		int n1,n2;
		int GCD=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no.");
		n1=sc.nextInt();
		System.out.println("enter the second no");
		n2=sc.nextInt();
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				GCD=i;
			}
		}
		System.out.println("the gc of two number is" +GCD);
		}
}
