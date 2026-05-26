package recursion;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
printno(5);
	}
public static void printno(int n) {
	if(n==0) {
		return;
	}
	
	printno(n-1);
	System.out.println(n);
}
}
