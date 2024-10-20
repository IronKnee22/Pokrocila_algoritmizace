package ukoly1;
import java.util.Scanner;
public class SPU1_5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Rovnice ma tento tvar ax^2 + bx + c = 0");
        System.out.println("Zadejte hodnoty a: ");
        double a = sc.nextDouble();
        System.out.println("Zadejte hodnoty b: ");
        double b = sc.nextDouble();
        System.out.println("Zadejte hodnoty c: ");
        double c = sc.nextDouble();
        
        double x1 = 0, x2 = 0;
        if(a==0 && b==0){
            System.out.println("Degenerovana rovnice");
        }

        else if(a==0){
            x1 = -c/b;
            System.out.printf("Jednoduchy koren: %f", x1);
        }

        else if(c==0){
            x1 = 0;
            x2 = -b/a;
            System.out.printf("Koreny jsou: %f, %f", x1, x2);
        }

        else{
            double D = b*b - 4*a*c;
            if(D>0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                System.out.printf("Koreny jsou: %f, %f", x1, x2);
            }
            else if(D==0){
                x1 = -b/(2*a);
                System.out.printf("Dvojnasobny koren: %f", x1);
            }
            else{
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-D) / (2 * a);
                System.out.printf("Komplexni koreny: %f + %fi, %f - %fi%n", realPart, imaginaryPart, realPart, imaginaryPart); 
            }
        }
        sc.close();
    }
    
}
