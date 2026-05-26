package Binarysearch;

public class count_occurrence {

    public static void main(String[] args) {
        int arr[] = {3,4,13,13,13,20,40};
        int target = 13;

        int count = countOcc(arr, target);
        System.out.println("Count: " + count);
    }

    public static int countOcc(int arr[], int target){
        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        // if element not present
        if(lb == arr.length || arr[lb] != target){
            return 0;
        }

        return ub - lb;
    }

    // LOWER BOUND → first index >= target
    public static int lowerBound(int arr[], int target){
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // UPPER BOUND → first index > target
    public static int upperBound(int arr[], int target){
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}