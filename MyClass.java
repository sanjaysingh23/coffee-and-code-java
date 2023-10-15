public class MyClass {
    int num1 = 20;
    static int num2 = 40;
    void disp1(){
        System.out.println("In disp1 "+num1);
    }
    static void disp2(){
        System.out.println("In disp2 "+num2);
    }
    public static void main(String arrs[]){
        MyClass m = new MyClass();
        System.out.println(m.num1);

        m.disp1();
        disp2();
    }
}
