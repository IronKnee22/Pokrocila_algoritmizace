package hodina;

public class hodina2_5 {
    public static boolean Najdi_prvek(int[] pole, int prvek){
        for(int i = 0; i < pole.length;i++){
            if(pole[i]==prvek){
                return true;
                
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] pole = {3, 5, 1, 4, 2};
        boolean x = Najdi_prvek(pole, 7);
        if(x==true){
            System.out.println("Prvek nalezen");
        }
        else{
            System.out.println("Prvek nenalezen");
        }
        
    }
    
}
