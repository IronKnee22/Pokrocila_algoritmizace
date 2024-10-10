package ukoly1;
import java.util.Scanner;
public class SPU1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Zadej tri strany trojuhelniku: ");
        double temp_a = sc.nextDouble();
        double temp_b = sc.nextDouble();
        double temp_c = sc.nextDouble();
        
        double a, b, c;

        if(temp_a >= temp_b && temp_a >= temp_c){
            c = temp_a;
            a = temp_c;
            b = temp_b;
        }
        else if(temp_b >= temp_a && temp_b >= temp_c){
            c = temp_b;
            a = temp_a;
            b = temp_c;
        }
        else{
            c = temp_c;
            a = temp_a;
            b = temp_b;
        }
        
        if(Math.abs(a*a + b*b - c*c) < 1E-6){
            System.out.println("Jedna se o pravouhli trojuhelnik");
        }
        else{ System.out.println("Nejedna se o pravoduhli trojuhelnik");}
        sc.close();
          
    }

    
    
}
