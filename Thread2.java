public class Thread2 implements Runnable {
    char ch = 'A';
    synchronized public void run(){
        for(int i=0; i<10; i++){
            System.out.print(ch+"  ");
            ch++;
        }
    }
    public static void main(String args[]){
        Thread2 t = new Thread2();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
