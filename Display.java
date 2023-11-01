import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Display{
    synchronized void disp(){
        for(int i=1; i<=10;i++){
            System.out.println(Thread.currentThread()+" "+i);
        }
    }
    public static void main(String args[]){
        Display d = new Display();
        Runnable ref = ()->{d.disp();};
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.execute(ref);
        exec.execute(ref);
        exec.execute(ref);
        System.out.println(ref.getClass().getName());
        exec.shutdown();
    }
}