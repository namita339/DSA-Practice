package hashmap_sets;
import java.util.*;
public class countfreq {
public void count(int arr[]) {
	HashMap<Integer,Integer> hp=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hp.containsKey(arr[i])) {
			hp.put(arr[i], hp.get(arr[i])+1);
		}else {
			hp.put(arr[i], 1);
		}
	}
	for(int key:hp.keySet()) {
		System.out.println(key+ " -> " + hp.get(key));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int arr[] = {1, 2, 3, 2, 1, 1, 4};

        countfreq obj = new countfreq();
        obj.count(arr);

	}

}
