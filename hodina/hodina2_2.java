package hodina;
import java.util.Scanner;
public class hodina2_2 {
    public static void main(String[] args) {
        int[] pole = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5;i++) {
            System.out.printf("Zadej hodnotu 1-14 pro %d kartu: ",i+1);
            pole[i] = sc.nextInt();  
        }

        int soucet = 0;
        int max = 0;
        for(int i = 0; i < pole.length;i++){
            soucet += pole[i];

            if(max<pole[i])
            {
                max = pole[i];
            }
        }
        System.out.printf("%nSoucet prvku je %d",soucet);
        System.out.printf("%nMax prvek je %d: ", max);
        sc.close();
    }
    
}
