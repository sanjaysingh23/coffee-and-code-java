import java.util.Scanner;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class Demo3 {
    public void show1(){
        show2();
    }
    public void show2(){
        try{
            show3();
        }
        catch(MyException me)
        {
            System.out.println(me);
        }
    }
    public void show3()throws MyException
    {
        int num ;
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        
        if(num > 10){
            throw new MyException("Number greater then 10 is not allowed");
        }
        else{
            System.out.println("The number is "+num);
        }
        
    }
    public static void main(String arr[]){
        Demo3 d = new Demo3();
        d.show1();
    }
}
