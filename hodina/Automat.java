package hodina;


public class Automat {

    public int vstup;
    public int vystup;
    public int stav = 1;

    public int[][] prechod_stavy = {
        {2,2,3},
        {0,1,2},
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
    }
   
    public static void main(String[] args) {
        Automat automat = new Automat();
        automat.setInput(0);
        System.out.println(automat.getState());
        automat.next();
        System.out.println(automat.getState());
        automat.setInput(2);
        System.out.println(automat.getState());
   }
}
