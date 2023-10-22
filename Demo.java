import java.lang.RuntimeException;
class Exp {
    // int num = 20;
    void disp()throws RuntimeException
    {
        int num = 25;
        if(num>20){
            throw new RuntimeException ();
        }
    }
    void disp2(){
        try{
            disp();
            
        }
        catch(RuntimeException re){
            System.out.println("The error is "+re.getMessage());
        }
    }
}
public class Demo{
    public static void main(String arr[]){
        Exp e = new Exp();
        e.disp2();
    }
}