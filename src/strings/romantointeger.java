package strings;

public class romantointeger {
	public int value(char ch) {
	if(ch=='I') return 1;
	if(ch=='V') return 5;
	if(ch=='X') return 10;
     if(ch=='L') return 50;
     if(ch=='C') return 100;
     if(ch=='D') return 500;
     return  1000;
	}
public int convert(String s) {
	int result=0;
	for(int i=0;i<s.length()-1;i++) {
		int curr=value(s.charAt(i));
		int next=value(s.charAt(i+1));
		if(curr<next) {
			result-=curr;
		}else {
			result+=curr;
		}
		
}
	result += value(s.charAt(s.length() - 1));
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romantointeger t=new romantointeger();
		
System.out.println(t.convert("III"));
	}

}
