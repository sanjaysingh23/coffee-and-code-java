class Base{
    int x;
    Base(){
        System.out.println("base no param");
    }
    Base(int x){
        this.x = x;
        System.out.println("Base 1 param "+x);
    }
}
class Sub1 extends Base{
    int y;
    Sub1(){
        System.out.println("Sub1 no param");
    }
    Sub1(int y){
        this.y = y;
        System.out.println("Sub1 1 param "+y);
    }
}
class Sub2 extends Base{
    int a;
    Sub2(){
        System.out.println("Sub2 no param ");
    }
    Sub2(int a){
        this.a = a;
        System.out.println("Sub2 1 param "+a);
    }
}
public class Demo6 {
    public static void main(String arr[]){
        Sub1 s1 = new Sub1(10);
        Sub2 s2 = new Sub2();
        Sub2 s3 = new Sub2(20);
    }
}
