package strings;

public class largest_odd {
public String odd(String s) {
	 int idx = -1;
	for(int i=s.length()-1;i>=0;i--) {
		if((s.charAt(i)- '0')%2==1) {
			idx=i;
			break;
		}
		
	}
	if (idx == -1) return "";

	int i=0;
	while(s.charAt(i)==0) {
		i++;
	}
	return s.substring(i,idx+1);
}
	public static void main(String[] args) {
		largest_odd solution = new largest_odd();
        String num = "504371";
        String result = solution.odd(num);
        System.out.println("Largest odd number: " + result);
	}

}
