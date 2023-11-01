interface MyInterface{
    void fun();
}
public class Demo3 {
    static void perform(MyInterface ref )
    {
        System.out.println("Perform of Demo3");
        ref.fun();
    }
    public static void main(String args[]){
        perform(()->{System.out.println("fun");});
    }
}
