package basics;

public class divisors {
	public static void main(String[] args) {
print();
}
	public static void print() {
		int n=4;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}