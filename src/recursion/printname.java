package recursion;

public class printname {

    public static void main(String[] args) {
        printName(5);
    }

    public static void printName(int n) {

        if(n == 0) {   
            return;
        }

        System.out.println("Namita");  
        printName(n - 1);            
    }
}

