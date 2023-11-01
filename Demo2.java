interface Second{
    void disp();
}
public class Demo2 {
    public static void main(String args[]){
        Second ref1 = ()->{System.out.println("Disp of ref1");};
        Second ref2 = ()->{System.out.println("Disp of ref2");};
        System.out.println(ref1.getClass().getName());
        ref1.disp();
        System.out.println(ref2.getClass().getName());
        ref2.disp();     
    }
}
