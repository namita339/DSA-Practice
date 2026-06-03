package strings;

import java.util.Arrays;

public class countfreq {

    public char count(String s) {

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        int maxFreq = 1;
        int freq = 1;

        char ans = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] == arr[i - 1]) {
                freq++;
            }
            else {
                freq = 1;
            }

            if(freq > maxFreq) {
                maxFreq = freq;
                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        countfreq obj = new countfreq();

        System.out.println(obj.count("banana"));
    }
}
