package basic1;
import java.util.*;
public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perfect();
		//strongno();
		//count();
		//fibonnaci(7);
		binarytodecimal(1010);

	}
//public static void perfect() {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter the number");
	//int n=sc.nextInt();
	//int sum=0;
	//int original=n;
	//for(int i=1;i<n/2;i++) {
		//if(n%i==0) {
			//sum=sum+i;
		//}
		
//	}
	//if(sum==original) {
		//System.out.println("perfect number");
	//}
//}
//public static void strongno() {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter the number");
	//int n=sc.nextInt();
	//int original=n;
	//int sum=0;
	//while(n>0) {
		//int digit=n%10;
		//sum=sum+fact(digit);
		//n=n/10;
		
		
	//}
	//if(sum==original) {
	//	System.out.println("strong no.");
	//}else {
	//	System.out.println("not strong no.");
	//}
//}
//public static int fact(int n) {
	//int f=1;
	//for(int i=1;i<=n;i++) {
		//f=f*i;
	//}
	//return f;
//}
	//public static void count() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number:");
		//int n=sc.nextInt();
		//int count=0;
		//while(n>0) {
			//int digit=n%10;
			//if(digit%2==0) {
				//count++;
			//}
			//n=n/10;
		//}
		//System.out.println(count);
	//}
	//public static void fibonnaci(int n) {
		//int a=0;
	//	int b=1;
		//if(n==1) {
			//System.out.println(a);
			//return;
		//}
		//for(int i=2;i<n;i++) {
			//int c=a+b;
			//a=b;
			//b=c;
			
		//}
	
	//System.out.println(b);
	//}
	public static void binarytodecimal(int n) {
		int sum=0;
		int power=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+(digit*(int)Math.pow(2, power));
			power++;
			n=n/10;
		}
		
	System.out.println(sum);
}
}
