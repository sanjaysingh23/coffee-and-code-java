class Top1 {
    void disp1(){
        System.out.println("In top1 disp");
    }
}
class Bottom1 extends Top1{
    void disp1(){
        System.out.println("In bottom1 disp");
    }
}
class Bottom2 extends Top1{
    void disp1(){
        System.out.println("In Bottom2 disp");
    }
}
class Bottom3 extends Top1{
    void disp1(){
        System.out.println("In Bottom3 disp");
    }
}
public class Demo4 {
    public static void main(String arr[]){
        Top1 t1 = new Bottom1();
        t1.disp1();
        Top1 t2 = new Bottom2();
        t2.disp1();
        Top1 t3 = new Bottom3();
        t3.disp1();
    }
}

