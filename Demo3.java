class A{
    void funA(){
        System.out.println("In function A");
    }
}
class B{
    void funB(){
        System.out.println("In function B");
    }
}
class C{
    void funC(){
        System.out.println("In function C");
    }
}
class D{
    void funD(){
        System.out.println("In function D");
    }
}
public class Demo3 {
    public static void main(String arr[]){
        Object arrDemo3[] = new Object[4];
        arrDemo3[0] = new A(); 
        arrDemo3[1] = new B(); 
        arrDemo3[2] = new C(); 
        arrDemo3[3] = new D(); 
    
        for(int i=0; i<arrDemo3.length;i++){
            if(arrDemo3[i] instanceof C){
                C ref = (C)arrDemo3[i];
                ref.funC();
            }
        }
    }
}