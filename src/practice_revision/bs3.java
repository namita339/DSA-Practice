package practice_revision;

public class bs3 {
public int find(int num) {
	int low=0;
	int high=num;
	int result=-1;
	while( low<=high) {
		int mid= low+(high-low)/2;
		if(mid*mid>=num) {
			result=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bs3 b=new bs3();
		System.out.println(b.find(25));

	}

}
