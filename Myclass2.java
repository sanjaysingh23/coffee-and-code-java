class Myclass{
    public static void main(String args[]){
        System.out.println("Myclass");
    }
}
class Demo1 extends Myclass{
    public static void main(String args[]){
       System.out.println("Demo1");
    }
}
public class Myclass2{

    public static void main(String args[]){
        Myclass m = new Myclass();
        
        Myclass m1 = new Demo1();
        Demo1.main(args);
       System.out.println("Myclass2");
    }
    
    
    
}