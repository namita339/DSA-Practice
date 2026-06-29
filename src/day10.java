import java.util.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class day10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        // Input
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            arr[i] = new Student(name, score);
        }

        // Stable Bubble Sort
        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - 1 - i; j++) {

                // swap only when left score is greater
                if(arr[j].score > arr[j + 1].score) {

                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].score);
        }
    }
}