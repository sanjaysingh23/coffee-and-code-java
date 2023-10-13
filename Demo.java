class A{
    
        private static int num1 ;
        private int num2;
        
    public
        static void setNum1(int num1){
            A.num1 = num1;
        }
        
        void setNum2(int num2){
            this.num2 = num2;
        }
        static int getNum1(){
            return num1;
        }
        int getNum2(){
            return num2;
        }

}
class B{
    private
        static int num1 ;
        int num2;
    
    public
        static void setNum1(int num1){
            B.num1 = num1;
        }
        void setNum2(int num2){
            this.num2 = num2;
        }
        static int getNum1(){
            return num1;
        }
        int getNum2(){
            return num2;
        }
}
class C{
    private
        static int num1 ;
        int num2;
    
    public
        static void setNum1(int num1){
            C.num1 = num1;
        }
        void setNum2(int num2){
            this.num2 = num2;
        }
        static int getNum1(){
            return num1;
        }
        int getNum2(){
            return num2;
        }
}
public class Demo {
    public static void main(String args[]){
        A d1 = new A();
        A.setNum1(30);
        d1.setNum2(300);
        System.out.println(A.getNum1());
        System.out.println(d1.getNum2());
        B d2 = new B();
        B.setNum1(40);
        d2.setNum2(400);
        System.out.println(B.getNum1());
        System.out.println(d2.getNum2());
        C d3 = new C();
        C.setNum1(50);
        d3.setNum2(500);
        System.out.println(C.getNum1());
        System.out.println(d3.getNum2());
    }
    
}
