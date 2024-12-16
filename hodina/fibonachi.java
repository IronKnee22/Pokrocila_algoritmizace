package hodina;

public class fibonachi {
    public static long fib_rek(long n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib_rek(n-1)+fib_rek(n-2);
    }

    public static long fib_iter(long n){
        long a=0;
        long b=1;
        long c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
    public static long start_timer(){
        long start = System.currentTimeMillis();
        
        return start;
    }
    public static void end_timer(long start){
        long end = System.currentTimeMillis() - start;
        
        System.out.println("Time: "+end);
    }

    public static void main(String[] args) {
        long start = start_timer();
        System.out.println(fib_rek(40));
        end_timer(start);

        long start1 = start_timer();
        System.out.println(fib_iter(40));
        end_timer(start1);
    }
    
}
