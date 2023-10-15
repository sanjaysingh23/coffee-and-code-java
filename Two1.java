class First{
    int num1 = 20;
    void disp1(){
        System.out.println("In First value of num1 is "+num1);
    }
    void disp2(){
        System.out.println("In disp2");
    }
    First(){
        System.out.println("In First const");
    }
}
class Second{
    int num2 = 50;
    void disp3(){
        System.out.println("In Second value of num2 is "+num2);
    }
    void disp4(){
        System.out.println("In disp4");
    }
    Second(){
        System.out.println("In Second const");
    }
}

public class Two1{
    public static void main(String arrs[]){
        First f1 = new First();
        First f2 = new First();
        Second s1 = new Second();
        Second s2 = new Second();
        f1.disp1();
        f2.disp2();
        s1.disp3();
        s2.disp4();
    }
}