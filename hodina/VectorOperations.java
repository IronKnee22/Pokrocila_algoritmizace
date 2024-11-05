package hodina;

public class VectorOperations {
   public static int[][] floydWarshall(int[][] matrix) {
    int N = matrix.length;
    int[][] result = new int[N][N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            result[i][j] = matrix[i][j];
        }
    }

    for (int k = 0; k < N; k++) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (result[i][k] != Integer.MAX_VALUE && result[k][j] != Integer.MAX_VALUE) {
                    result[i][j] = Math.min(result[i][j], result[i][k] + result[k][j]);
                }
            }
        }
    }

    return result;
}

    public static int[][] generateD() {
        int[][] matrix = {
            {0, 20, Integer.MAX_VALUE, 3,Integer.MAX_VALUE},
            {Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE,1},
            {8, Integer.MAX_VALUE, 0, Integer.MAX_VALUE,3},
            {Integer.MAX_VALUE, 5, 4, 0,Integer.MAX_VALUE},
            {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,2,0}
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
