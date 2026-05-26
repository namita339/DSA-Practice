package basics;

import java.util.Scanner;

public class armstrongno {

	public static void main(String[] args) {
		armstrongcheck();

	}
public static void armstrongcheck() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. to check");
	int n=sc.nextInt();
	int temp=0;
	int original=n;
	while(n>0) {
		int digit=n%10;
		temp=temp+digit*digit*digit;
		n=n/10;
		
	} 
	if(temp==original) {
	System.out.println("the given number is armstrong");
}
	else {
		System.out.println("not a armstrong number");
	}
}
}