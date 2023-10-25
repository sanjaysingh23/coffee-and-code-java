class Demo  implements Runnable {
    int start;
    int end;
    public Demo(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        if(start < end){
            for(int i=start;i<=end;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        else{
            for(int i=start;i>=end;i--){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}
public class Thread5{
    public static void main(String args[]){
        Thread t1 = new Thread(new Demo(1, 50));
        Thread t2 = new Thread(new Demo(50, 1));
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
    }
}
