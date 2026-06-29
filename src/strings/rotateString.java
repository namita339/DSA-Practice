package strings;

public class rotateString {
public boolean rotate(String s,String goal) {
	for(int i=0;i<s.length();i++) {
		String newstring=s+s;
		if(newstring.contains(goal)) {
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateString s=new rotateString();
		boolean result=s.rotate("rotation","tionrota");
		System.out.println(result);
	}

}
