interface Calulator{
    int multiply(int a, int b);
}
public class CalcDemo {
    public static void main(String args[]){
        Calulator ref = (a,b)->{return (a*b);};
        System.out.println(ref.multiply(10, 20));
    }
}
