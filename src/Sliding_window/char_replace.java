package Sliding_window;
import java.util.*;
public class char_replace {
public int replacement(String s,int k) {
	int l=0;
	int r=0;
	int max_len=0;
	int freq=0;
	HashMap<Character,Integer> mp=new HashMap<>();
	while(r<s.length()) {
		if(mp.containsKey(s.charAt(r))) {
			mp.put(s.charAt(r), mp.get(s.charAt(r))+1);
		}else {
			mp.put(s.charAt(r), 1);
		}
		freq=Math.max(freq,mp.get(s.charAt(r)));

		while((r-l+1)-freq > k) {
			 mp.put(s.charAt(l),
		               mp.get(s.charAt(l)) - 1);
			l++;
		}
		max_len=Math.max(max_len, r-l+1);
		r++;
	}
	return max_len;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char_replace c=new char_replace();
		System.out.println(c.replacement("AABABBA",1));

	}

}
