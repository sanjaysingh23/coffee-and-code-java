class Check{
    int num1 = 10;
    private int num2 = 20;
    public int num3 = 30;
    protected int num4 = 50;
    public void disp(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    } 
    int getVal(){
        return num4;
    }
}
public class CheckDemo   {
    public static void main(String arr[]){
        Check c = new Check();
        // c.num1;
        // c.num2;
        // c.num3;
        // c.num4;
        c.disp();
        c.getVal();
    }
}
