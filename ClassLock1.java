public class ClassLock1 implements Runnable{
    static Class cs;
    static void disp(){
        synchronized (cs){
            for(int i=0; i<5; i++){
                System.out.print(i+" ");
            }
        }
    }
    public void run(){
        disp();
    }
    public static void main(String args[]) throws Exception
    {
        cs=Class.forName("ClassLock1");
        ClassLock1 l1 = new ClassLock1();
        ClassLock1 l2 = new ClassLock1();
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
        t1.start();
        t2.start();
    }
}