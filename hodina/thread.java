package hodina;

public class thread { 
public static class SampleThread extends Thread{

    private int index;
    public SampleThread(int index){
        this.index = index;
    }
    @Override
    public void run(){
        System.out.println("Thread " + index + " is running");
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            SampleThread t = new SampleThread(i);
            t.start();
        }
        
    }
    
}}
