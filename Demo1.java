class Base{
    static {
        System.out.println("In base disp");
    }
}
class Sub extends Base{
    static {
        System.out.println("In sub disp");
    }
}
public class Demo1 {
    public static void main(String arr[]){
        Sub s = new Sub();
    }
}
