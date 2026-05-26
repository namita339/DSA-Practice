package basic1;
import java.util.*;
public class countdigit {
	
public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
	}


}
