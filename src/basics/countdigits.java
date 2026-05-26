package basics;

public class countdigits {
	public static void main(String[] args) {
		countdigit();

	}
public static void countdigit() {
	int count=0;
	int n=12345;
	while(n>0) {
		n=n/10;
		count++;
		
	}
	System.out.println("total digits="+count);
}
}

