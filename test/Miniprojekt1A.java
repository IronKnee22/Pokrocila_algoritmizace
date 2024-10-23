package test;
import java.util.Scanner;;

public class Miniprojekt1A {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int max_oken = 0;
      int celkove_oken = 0;

      for(int i = 1; i <= 3; i++){
         System.out.printf("Vlozte pocet oken umytych brigdnikem c. %d : ", i);
         int pocet_oken = sc.nextInt();
         celkove_oken += pocet_oken;

         if(pocet_oken<10){
            System.out.println("--- Malo vykonny brigadnik, vyradit ---");
         }

         if(max_oken<pocet_oken){
            max_oken = pocet_oken;
         }

      }
      System.out.printf("%nDnes bylo umyto celkem %d oken", celkove_oken);
      System.out.printf("%nJeden brigadnik dnes umyl maximalne 21 oken");
        
       sc.close();
   } 
}
