package basic1;
import java.util.*;
public class divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printdivisor();
	}
	public static void printdivisor() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
