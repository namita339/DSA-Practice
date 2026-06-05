package strings;

public class reverse_word {
public String reverse(String s) {
	StringBuilder result=new StringBuilder();
	int i=s.length()-1;
		while(i>=0) {
		while(i>=0 && s.charAt(i)==' ') {
			i--;
		}
		int end=i;
		while(i>=0 && s.charAt(i)!=' ') {
			i--;
		}
		String temp=s.substring(i+1, end+1);
		if(result.length()>0) {
			result.append(" ");
		}
		result.append(temp);
	}
		return result.toString();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_word o=new reverse_word();
		String st=o.reverse("the sky is blue ");
		System.out.println(st);

	}

}
