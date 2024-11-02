package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Miniprojekt2B {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla= new ArrayList<>();
        
        while (true) {
            System.out.print("Zadej cisla: ");
            int cislo = sc.nextInt();
            if(cislo == 0){
                break;
            }
            cisla.add(cislo);
            
        }
        
        double suma = 0;
        for(int i = 0; i < cisla.size(); i++){
            suma += cisla.get(i);
        }
        double prumer = suma / cisla.size();

        System.out.println(prumer);
        Collections.reverse(cisla);
        System.out.println(cisla);
        sc.close();} 
}
