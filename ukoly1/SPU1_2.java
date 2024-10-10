package ukoly1;
import java.util.Scanner;
public class SPU1_2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Zadej rychlost v m/s: ");
        double m_s = sc.nextDouble();
        double mi_h = m_s * 3600 / 1609.35;
        System.out.printf("Rychlost prepocitana na mi/h = %.2f\n", mi_h);
        sc.close(); 
   } 
}
