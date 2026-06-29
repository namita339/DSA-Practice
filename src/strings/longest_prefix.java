package strings;

import java.util.Arrays;

public class longest_prefix {
public String prefix(String[] s) {
	Arrays.sort(s);
	StringBuilder result=new StringBuilder();
	char arr1[]=s[0].toCharArray();
	char arr2[]=s[s.length-1].toCharArray();
	for(int i=0;i< Math.min(arr1.length, arr2.length);i++) {
		if(arr1[i]==arr2[i]) {
			result.append(arr1[i]);
		}else {
		    break;
		}
	}
	return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longest_prefix l=new longest_prefix();
		String[] arr = {"flightu", "flowing", "flower"};

        System.out.println(l.prefix(arr));

	}

}
