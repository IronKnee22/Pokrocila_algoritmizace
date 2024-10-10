package ukoly1;
import java.util.Scanner;

public class SPU1_3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nejprve v sede zmerte na zapesti pocet tepu: ");
    double TF1 = sc.nextDouble();
    System.out.println("Provedte 30 drepu v pravidelnem tempu 1 drep za sekundu");
    System.out.print("Ihned po vykonu usednete a zmerte pocet tepu: ");
    double TF2 = sc.nextDouble();
    System.out.println("V klidu sedte a uklidnujte se po dobu 1 minuty");
    System.out.print("Pak zmerte pocet tepu: ");
    double TF3 = sc.nextDouble();

    double RI = ((TF1 + TF2 + TF3)-200)/10;
    System.out.printf("Ruffieruv index = %.1f\n", RI);

    // B
    if(RI <= 0){
        System.out.println("Zdatnost vyborna");
    }
    else if(RI<=5){
        System.out.println("Zdatnost velmi dobra");
    }
    else if(RI<=10){
        System.out.println("Zdatnost prumerna");
    }
    else if(RI<=15){
        System.out.println("Zdatnost podprumerna");
    }
    else{
        System.out.println("Zdatnost nedostatecna");
    }

    sc.close();
   } 
}
