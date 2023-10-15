class Parent{
    int num1;
    Parent(int num1){
        this.num1 = num1;
    }
    void disp1(){
        System.out.println("In parent disp " + num1);
    }
    void disp2(int num1){
        this.num1 = num1;
        System.out.println("In parent disp2 "+num1);
    }
}
class Child1 extends Parent{
    int num2;
    Child1(int num2){
        super(30);
        this.num2 = num2;
    }
    void disp1(){
        System.out.println("In child1 disp "+num2);
    }
    void disp3(int num2){
        this.num2 = num2;
        System.out.println("In parent disp3 "+num2);
    }
}
class Child2 extends Parent{
    int num3,num4;
    Child2(int num3, int num4){
        super(50);
        this.num3 = num3;
        this.num4 = num4;
    }
    void disp1(){
        System.out.println("In child2 disp "+num3+" "+num3);
    }
    void disp4(int num3,int num4){
        this.num3 = num3;
        this.num4 = num4;
        System.out.println("In parent disp2 "+num3+" "+num4);
    }
}
public class Demo3 {
    public static void main(String args[]){
        Parent p = new Parent(100);
        p.disp1();
        p.disp2(1000);
        Child1 c1 = new Child1(200);
        c1.disp1();
        c1.disp3(2000);
        Parent c2 = new Child2(300,400);
        c2.disp1();
        Child2 c3 = new Child2(3000, 4000);
        c3.disp1();
        c3.disp4(5000, 6000);

    }
}
