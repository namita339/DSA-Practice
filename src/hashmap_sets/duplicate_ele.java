package hashmap_sets;
import java.util.*;
public class duplicate_ele {
public void print(int arr[]) {
	HashSet<Integer> s=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		if(s.contains(arr[i])) {
			System.out.println(arr[i]);
		}else {
		s.add(arr[i]);
		
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,8,4,4,89,9};
		duplicate_ele e=new duplicate_ele();
		e.print(arr);

	}

}
