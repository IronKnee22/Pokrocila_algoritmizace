package hodina;

public class hodina2_1 {
    
    public static void Double_for(int num){
        for (int i = 0; i < num; i++){
            for (int j= 0; j < num; j++){
                
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    public static void While_cyklus(int num){
        while (num>=1){
            System.out.print("#");
            num /=2;
        }
    }
    public static void main(String[] args) {
        Double_for(5);
        System.out.println();
        While_cyklus(5);
    } 
}
