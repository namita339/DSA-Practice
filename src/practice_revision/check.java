package practice_revision;

public class check {
public int sum(int n,int sum) {
	int ld=n%10;
	sum=sum+ld;
	n=n/10;
	return sum(n-1,sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
