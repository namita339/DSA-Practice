package sorting;

public class quicksort {

    public static void main(String[] args) {

        int arr[] = {4, 6, 5, 7, 8, 1, 5};

        sort(arr, 0, arr.length - 1);

        for (int r = 0; r < arr.length; r++) {
            System.out.println(arr[r]);
        }
    }

    public static void sort(int arr[], int low, int high) {

        if (low < high) {   // VERY IMPORTANT base condition

            int p_index = partition(arr, low, high);

            sort(arr, low, p_index - 1);
            sort(arr, p_index + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (true) {

            while (i <= high && arr[i] <= pivot)
                i++;

            while (j >= low && arr[j] > pivot)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        // place pivot in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}