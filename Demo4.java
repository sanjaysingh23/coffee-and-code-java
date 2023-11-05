interface Sample{
    void disp();
}
public class Demo4 {
    void fun(){
        System.out.println("In fun");
    }
    public static void main(String args[]){
        Demo4 d = new Demo4();
        Sample ref = d::fun;
        ref.disp();
    }
}
