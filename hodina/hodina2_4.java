package hodina;
import java.util.ArrayList;
import java.util.Scanner;
public class hodina2_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Zadej hodnotu karty 1-14 pro ukoceni zadej 0");
            int cislo = sc.nextInt();
            if (cislo == 0){
                break;
            }
            list.add(cislo);
        }
        for(int i = 0; i<list.size();i++){
                if(list.get(i)%2==0){
                    System.out.printf("%n%d a je sude", list.get(i));
                }
                else{
                    System.out.printf("%n%d", list.get(i));
                }
        }
        sc.close();
    }
    
}
