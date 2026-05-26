package basic1;
import java.util.*;
public class reverse1 {

	public static void main(String[] args) {
		reverse();

	}
public static void reverse() {
	int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
while(n>0) {
	temp=temp*10+n%10;
	n=n/10;
}
System.out.println(temp);
}
}
