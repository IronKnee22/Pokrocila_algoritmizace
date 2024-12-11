package test;

import java.util.Arrays;

public class blok8 {
    public static int findMaxValue(int[][] arr) {
            int max = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
            return max;
        }

    public static int[] generateHistogram(int[][] arr) {
        int max = findMaxValue(arr);
        int[] hist = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                hist[arr[i][j]]++;
            }
        }
        return hist;
    }

    public static int[][] generateRandomMatrix(int dim1, int dim2, int maxValue){
        int[][] arr = new int[dim1][dim2];
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                arr[i][j] = (int) (Math.random() * (maxValue + 1));
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        
         int[][] arr = {
            {0, 0, 1, 1},
            {2, 1, 2, 5},
            {1, 2, 3, 4},
            {7, 7, 1, 0}
        };
        int max = findMaxValue(arr);
        System.out.println("Maximalni hodnota: " + max);

        int[] hist = generateHistogram(arr);
        
        System.out.println("Histogram:" + Arrays.toString(hist));

        int[][] arr2 = generateRandomMatrix(4, 4, 10);
        int max2 = findMaxValue(arr2);
        System.out.println("Maximalni hodnota: " + max2);

        int[] hist2 = generateHistogram(arr2);
        
        System.out.println("Histogram:" + Arrays.toString(hist2));
    }
    
}
