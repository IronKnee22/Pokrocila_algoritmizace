package ukoly1;
import java.util.Scanner;
public class SPU1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = 0;
        System.out.println("Zadej cisla: ");
        while (true){
            double number = sc.nextDouble();
            
            if(number == 0){
                break;
            }
            
            if(number % 2 != 0 && number % 3 == 0){
                pocet++;
            }

            


        }
        System.out.printf("Pocet cisel ktero jsou zaroven licha a delitelna 3 je: %d\n",pocet);
        sc.close();


    }
    
}
