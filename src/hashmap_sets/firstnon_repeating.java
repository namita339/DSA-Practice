package hashmap_sets;
import java.util.*;
public class firstnon_repeating {
public char search(String s) {
	HashMap<Character,Integer> hm= new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(hm.containsKey(ch)) {
			hm.put(ch,hm.get(ch)+1);
		}else {
			hm.put(ch, 1);
		}
	}
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(hm.get(ch)==1) {
			return ch;
		}
	}
	return '#';
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstnon_repeating fr=new firstnon_repeating();
		System.out.println(fr.search("aabbcde"));

	}

}
