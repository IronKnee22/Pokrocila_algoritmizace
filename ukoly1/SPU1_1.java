package ukoly1;

import java.util.Scanner;

public class SPU1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej delky odvesen: "); 
        double odvesna1 = sc.nextDouble(); 
        double odvesna2 = sc.nextDouble();
        double prepona = Math.sqrt(Math.pow(odvesna1, 2)+Math.pow(odvesna2, 2));

        System.out.printf("Delka prepony je %.4f\n", prepona);

        sc.close();
    }  
}