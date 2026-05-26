package array1;

import java.util.Arrays;

public class twosum {

    public static void main(String[] args) {

        int arr[] = {2,6,5,8,11};

        int result[] = sum(arr,14);

        System.out.println(Arrays.toString(result));
    }

    public static int[] sum(int arr[], int target) {

        int n = arr.length;

        for(int i=0;i<n;i++) {

            for(int j=i+1;j<n;j++) {

                int sum = arr[i] + arr[j];

                if(sum == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}