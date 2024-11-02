package hodina;



public class hodina3_2 {
    public static void main(String[] args) {
        int[][] matice = VectorOperations.generateD();
        VectorOperations.printMatrix(matice);

        VectorOperations.next_Floyd(matice);
        System.out.println();
        VectorOperations.printMatrix(matice);
    }
    
}
