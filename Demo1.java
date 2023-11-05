interface First{
    void disp();
}
public class Demo1{
    void fun1(){
        System.out.println("In fun1");
    }
    public static void main(String args[]){
        Demo1 d = new Demo1();
        First ref = d::fun1;
        ref.disp();
    }
}