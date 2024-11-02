package hodina;

public class VectorOperations {
    public static int[][] Floyd(int[][] matrix, int k){
        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j < matrix.length;j++){
                if(matrix[k][j] + matrix[j][k] < matrix[i][j]){
                    matrix[i][j] = matrix[k][j] + matrix[j][k];
                }
            }
        }
        return matrix;
    }

    public static int[][] next_Floyd(int[][] matrix){
        for(int k = 0; k< matrix.length;k++){
            Floyd(matrix, k);
        }
        return matrix;
    }

    public static int[][] generateD() {
        int[][] matrix = {
            {0, 3, Integer.MAX_VALUE, 7},
            {8, 0, 2, Integer.MAX_VALUE},
            {5, Integer.MAX_VALUE, 0, 1},
            {2, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] mat1, int[][] mat2) {
        int N = mat1.length;
 
        int[][] res = new int[N][N]; 
        int ctr = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = 0;  
                for (int k = 0; k < N; k++) { 
                    res[i][j] += mat1[i][k] * mat2[k][j];
                    ctr++;
                }
            }
        }
        System.out.printf("citac %d", ctr);
        return res;
    }

}
