class Base{
    // Base(){
    //     System.out.println("Base non param");
    // }
    Base(int x){
        System.out.println("Base 1 param");
    }
    Base(int x, int y){
        System.err.println("Base 2 param");
    }
}
class Sub extends Base{
    Sub(){
        super(123, 147 );
        System.out.println("Sub non param");
    }
    Sub(int a){
        super(123);
        System.out.println("Sub 1 param");
    }
    Sub(int  b, int c){
        super(123);
        System.out.println("Sub 2 param");
    }
}
public class Demo4 {
    public static void main(String arr[]){
        
        Sub s2 = new Sub(30);
        Sub s3 = new Sub(50, 100);
        Sub s1 = new Sub();
    }
}
