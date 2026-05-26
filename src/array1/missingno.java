package array1;

public class missingno {

    public static void main(String[] args) {

        int arr[]= {2,3,1,5};

        int result = number(arr);

        System.out.println(result);
    }

    public static int number(int arr[]) {

        int n = arr.length + 1;

        for(int i=1;i<=n;i++) {

            boolean found = false;

            for(int j=0;j<arr.length;j++) {

                if(arr[j]==i) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                return i;
            }
        }

        return -1;
    }
}
