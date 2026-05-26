package array;

public class unionarr {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,6,7,8};
        int[] arr2 = {11,23,56,78};

        merge(arr1, arr2);
    }

    public static void merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] num = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Main comparison loop
        while(i < n && j < m) {

            if(arr1[i] < arr2[j]) {
                if(k == 0 || num[k-1] != arr1[i]) {
                    num[k++] = arr1[i];
                }
                i++;
            }

            else if(arr1[i] > arr2[j]) {
                if(k == 0 || num[k-1] != arr2[j]) {
                    num[k++] = arr2[j];
                }
                j++;
            }

            else {
                if(k == 0 || num[k-1] != arr1[i]) {
                    num[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while(i < n) {
            if(k == 0 || num[k-1] != arr1[i]) {
                num[k++] = arr1[i];
            }
            i++;
        }

        // Remaining elements of arr2
        while(j < m) {
            if(k == 0 || num[k-1] != arr2[j]) {
                num[k++] = arr2[j];
            }
            j++;
        }

        // Print result
        for(int x = 0; x < k; x++) {
            System.out.print(num[x] + " ");
        }
    }
}