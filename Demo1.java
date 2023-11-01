interface Emp{
    abstract void disp1();
    default void disp2(){
        System.out.println("disp2");
    }
    static void disp3(){
        System.out.println("Disp3");
    }
}
public class Demo1{
    public static void main(String args[]){
        Emp ref = ()->{System.out.println("disp1");};
        ref.disp1();
        ref.disp2();
        Emp.disp3();
    }
}