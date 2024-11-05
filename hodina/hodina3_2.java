package hodina;



public class hodina3_2 {
    public static void main(String[] args) {
        int[][] matice = VectorOperations.generateD();
        VectorOperations.printMatrix(matice);

        int[][] result = VectorOperations.floydWarshall(matice);
        System.out.println();
        VectorOperations.printMatrix(result);
    }
    
}
