package array1;
public class arrsort {

    public static void main(String[] args) {
        int arr[] = {1,2,0,8,5};

        boolean result = sort(arr);
        System.out.println(result);
    }

    public static boolean sort(int arr[]) {

        for(int i=0; i<arr.length-1; i++) {

            if(arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}