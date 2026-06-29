package Sliding_window;
import java.util.*;
public class substring_norepeatingchar {
	public int substring(String s) {
		HashSet<Character> set=new HashSet<>();
		int max=0;
		int l=0;
		int r=0;
		while(r<s.length()) {
			if(!set.contains(s.charAt(r))) {
				set.add(s.charAt(r));
				r++;
				max=Math.max(max, set.size());
			}else {
				set.remove(s.charAt(l));
				l++;
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 substring_norepeatingchar s=new  substring_norepeatingchar();
		 System.out.println(s.substring("aaabbbccc"));

	}

}
