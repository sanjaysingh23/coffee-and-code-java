public class Thread4 implements Runnable {
    static Class sc;
    public void run(){
        synchronized (sc){
        for(int i=0; i<10; i++){
            System.out.println("Static "+i);
        }
    }
    }
    public static void main(String args[])throws Exception
    {
        sc = Class.forName("Thread4");
        Thread4 t = new Thread4();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
