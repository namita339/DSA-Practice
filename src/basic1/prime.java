package basic1;
import java.util.*;

public class prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if(isprimeno(n)) {
            System.out.println(n + " is a prime no.");
        }
        else {
            System.out.println(n + " is not a prime no.");
        }

    }

    public static boolean isprimeno(int n) {

        if(n <= 1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }

        return true;
    }
}