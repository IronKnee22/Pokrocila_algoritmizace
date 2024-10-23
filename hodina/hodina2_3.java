package hodina;
import java.util.ArrayList;;
public class hodina2_3 {
    public static long tic(){
        long aktualni_cas = System.currentTimeMillis();
        return aktualni_cas;
    }

    public static void toc(long start_time){
        long trvani = System.currentTimeMillis() - start_time;
        System.out.printf("%nprogram bezel %d", trvani);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        for (int i = 0; i < 100000000; i++) {
            list.add(1);
        }

        long start_time = tic();
        list.remove(0);
        toc(start_time);

        start_time = tic();
        list.remove(list.size() - 1);
        toc(start_time);

        for (int i = 0; i < 1000; i++) {
            list1.add(1);
        }

        start_time = tic();
        list1.remove(0);
        toc(start_time);

        start_time = tic();
        list1.remove(list1.size() - 1);
        toc(start_time);



    }
    
}
