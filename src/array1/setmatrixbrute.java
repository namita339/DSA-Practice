package array1;
public class setmatrixbrute {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZero(matrix);

        // print matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Traverse matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == 0) {
                    markRow(matrix, i, m);
                    markCol(matrix, j, n);
                }
            }
        }

        // Convert -1 into 0
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int[][] matrix, int row, int m) {
        for(int j = 0; j < m; j++) {
            if(matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public static void markCol(int[][] matrix, int col, int n) {
        for(int i = 0; i < n; i++) {
            if(matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }
}
