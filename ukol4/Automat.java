package ukol4;
import java.util.ArrayList;


public class Automat {

    ArrayList<Integer> historie_stavu = new ArrayList<>();
    ArrayList<Integer> historie_vystupu = new ArrayList<>();

    public int vstup;
    public int vystup;
    public int stav = 0;
    
   


    public int[][] prechod_stavy = {
        {2,2,3},
        {0,1,2},
        {1,1,0},
        {0,0,1}
    };

    public int[] vystupy = {0,1,5,3};


    public void setInput(int i ){
        vstup = i; 
    }

    public int getOutput(){
        vystup = vystupy[stav];
        return vystup;
    }

    public int getState(){
        return stav;
    }

    public void next(){
        stav = prechod_stavy[stav][vstup];
        historie_stavu.add(getState());
        historie_vystupu.add(getOutput());
    }

    public void getStateHistory() {
        System.out.print("Minule stavy: ");
        for (int i = Math.max(0, historie_stavu.size() - 5); i < historie_stavu.size(); i++) {
            System.out.print(historie_stavu.get(i) + " ");
        }
        System.out.println();
    }

    public void getOutputHistory() {
        System.out.print("Minule vystupy: ");
        for (int i = Math.max(0, historie_vystupu.size() - 5); i < historie_vystupu.size(); i++) {
            System.out.print(historie_vystupu.get(i) + " ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        Automat automat = new Automat();
        automat.setInput(0);
        System.out.println(automat.getState());
        automat.next();
        System.out.println(automat.getState());
        automat.setInput(1);
        automat.next();
        System.out.println(automat.getState());
        automat.setInput(2);
        automat.next();
        System.out.println(automat.getOutput());
        automat.next();
        automat.next();
        System.out.println(automat.getOutput());
        automat.getStateHistory();
        automat.getOutputHistory();
   }
}
