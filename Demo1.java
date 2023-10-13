class A{
    
        
        static{
            System.out.println("In class A");
        }
   

}
class B{
    
    static{
            System.out.println("In class B");
        } 
    
}
class C{
    
    static{
            System.out.println("In class C");
        }
    
}
public class Demo1 {
    public static void main(String args[]){
        
        B d2 = new B();
        C d3 = new C();
        A d1 = new A();
    }
    
}
