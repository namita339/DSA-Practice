package practice_revision;
import java.util.*;

public class s7 {

    public int Celebrity(int arr[][]) {

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            st.push(i);
        }

        // Elimination Process
        while(st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if(arr[a][b] == 1) {
                // a knows b, so a can't be celebrity
                st.push(b);
            } else {
                // a does not know b, so b can't be celebrity
                st.push(a);
            }
        }

        int celeb = st.pop();

        // Check row
        for(int j = 0; j < n; j++) {

            if(j == celeb) continue;

            if(arr[celeb][j] == 1) {
                return -1;
            }
        }

        // Check column
        for(int i = 0; i < n; i++) {

            if(i == celeb) continue;

            if(arr[i][celeb] == 0) {
                return -1;
            }
        }

        return celeb;
    }

    public static void main(String[] args) {

        int arr[][] = {
            {0,1,1,0},
            {0,0,0,0},
            {1,1,0,0},
            {0,1,1,0}
        };

        s7 c = new s7();

        System.out.println(c.Celebrity(arr));
    }
}