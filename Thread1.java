public class Thread1 extends Thread{
    char ch = 'A';
    public void run(){
        for(int i=0; i<10; i++){
            System.out.print(ch+"  ");
            ch++;
        }
    } 
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
    }
}