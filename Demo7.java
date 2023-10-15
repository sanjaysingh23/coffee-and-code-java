class Parent{
    void disp1(){
        System.out.println("Parent Disp 1");
    }
    void disp2(){
        System.out.println("Disp 2");
    }
}
class Child extends Parent{
    void disp1(){
        System.out.println("Child Demo1");
    }
    void disp4(){
        System.out.println("Disp 4");
    }
}
public class Demo7 {
    public static void main (String arr[]){
        Child c1 = new Child();
        c1.disp1();
        c1.disp2();
        c1.disp4();
        Parent p = new Child();
        p.disp1();
        p.disp2();
        //   p.disp4();     give error because parent do not have exis of child class members
    }
}


