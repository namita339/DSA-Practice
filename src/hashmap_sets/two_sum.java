package hashmap_sets;
import java.util.*;
public class two_sum {
public int[] sum(int arr[],int target) {
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(target-arr[i])) {
			return new int[] {hm.get(target-arr[i]),i};
		}else {
			hm.put(arr[i], i);
		}
	}
	 return new int[] {-1, -1};
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = {2, 7, 11, 15};
        int target = 9;

        two_sum obj = new two_sum();

        int ans[] = obj.sum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);

	}

}
