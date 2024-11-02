package test;
import java.util.Scanner;
import java.util.ArrayList;


public class Miniprojekt2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla= new ArrayList<>();
        ArrayList<Integer> nasobky= new ArrayList<>();
        while (true) {
            System.out.print("Zadej cisla: ");
            int cislo = sc.nextInt();
            if(cislo == 0){
                break;
            }
            cisla.add(cislo);
            
        }
        System.out.print("zadej jeste jedno cislo: ");
        int jeste_jedno = sc.nextInt();
        for(int i = 0; i < cisla.size(); i++){
            nasobky.add(cisla.get(i)*jeste_jedno);
        }

        System.out.println(cisla);
        System.out.println(nasobky);
        sc.close();
    }
    
}
