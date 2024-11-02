package hodina;

public class hodina3_1 {
    public static void main(String[] args) {
        int[][] matice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matice2 = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

        VectorOperations.printMatrix(matice1);

        int[][] vynasobena = VectorOperations.multiplyMatrix(matice1, matice2);
        System.out.println();
        VectorOperations.printMatrix(vynasobena);
    }
    
}
