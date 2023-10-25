public class Thread3 implements Runnable{
    public void run(){
        synchronized(this) {
        for(int i=0; i<5;i++){
            System.out.println("Exicute "+i);
        }
    }
    }
    public static void main(String args[]){
    Thread3 th = new Thread3();
    Thread th1 = new Thread(th);
    Thread th2 = new Thread(th);
    Thread th3 = new Thread(th);
    th1.start();
    th2.start();
    th3.start();
    }
}
                                         