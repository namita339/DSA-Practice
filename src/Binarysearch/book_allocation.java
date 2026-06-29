package Binarysearch;
public class book_allocation {

    public static int allocateBooks(int arr[], int students) {

        if (students > arr.length) {
            return -1;
        }

        int low = 0;
        int high = 0;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (countStudents(arr, mid) <= students) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int countStudents(int arr[], int maxPages) {

        int students = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }

        return students;
    }

    public static void main(String[] args) {

        int arr[] = {12, 34, 67, 90};
        int students = 2;

        System.out.println(allocateBooks(arr, students));
    }
}
