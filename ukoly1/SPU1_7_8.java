package ukoly1;
import java.util.Scanner;
public class SPU1_7_8 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = 0;
        int celkem = 0;
        double max_teplota = 0;
        double summ_bpm = 0;
        while(true){
            System.out.println("Zadej teplotu a potom tep: ");
            double teplota = sc.nextDouble();
            int bpm = sc.nextInt();

            if(teplota == 0 && bpm == 0){
                break;
            }

            if(max_teplota<teplota){
                max_teplota = teplota;
            }

            if(36<teplota && teplota<37 && 55<=bpm && bpm <=85){
                pocet++;
                summ_bpm += bpm;
            }
            celkem++;
        }
        System.out.printf("Pocet vzorku splnujici definovane rozmezi: %d\n", pocet);
        double procenta = (100*(double)pocet)/celkem;
        System.out.printf("Procento pacientu splnujicich def. rozmezi: %.2f\n",procenta);
        System.out.printf("Max teplota je %.1f\n", max_teplota);
        double prum_bpm = summ_bpm/pocet;
        System.out.printf("Prumerna tep. frekvence relevatnich pac.: %f",prum_bpm);
        sc.close();

   } 
}
