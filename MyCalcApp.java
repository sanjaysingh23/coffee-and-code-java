import java.util.Scanner;
class MyArithException extends Exception{
    MyArithException(String s){
        super(s);
    }
}
class Calculator{
    int calDouble(int num)throws MyArithException
    {
        if(num == 0){
            throw new MyArithException("Zero not allowed");
        }
        else if(num < 0){
            throw new MyArithException("Negative not allowed");
        }
        return num*2;
    }
}
public class MyCalcApp {

    public static void main(String arr []){
        int num;
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        Calculator c = new Calculator();
        try{
            c.calDouble(num);
        }
        catch(MyArithException m){
            System.out.println(m.getMessage());
        }
    }
}
