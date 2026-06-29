package Sliding_window;
import java.util.*;

public class fruit_basket {

    public int fruit(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int l = 0;
        int r = 0;
        int max_len = 0;

        while (r < arr.length) {

        	if(hm.containsKey(arr[r])) {
        	    hm.put(arr[r], hm.get(arr[r]) + 1);
        	} else {
        	    hm.put(arr[r], 1);
        	}
            while (hm.size() > 2) {

                int count = hm.get(arr[l]);

                if (count == 1) {
                    hm.remove(arr[l]);
                } else {
                    hm.put(arr[l], count - 1);
                }

                l++;
            }

            max_len = Math.max(max_len, r - l + 1);

            r++;
        }

        return max_len;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 2};

        fruit_basket b = new fruit_basket();

        System.out.println(b.fruit(arr));
    }
}