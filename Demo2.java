class Vehicle{
    void start(){
        System.out.println("Vehicle disp");
    }
}
class FourWheeler extends Vehicle{
    void start(){
        System.out.println("FourWheeler disp");
    }
}
public class Demo2 {
    public static void main(String args[]){
        Vehicle v1= new Vehicle();
        v1.start();
        Vehicle v = new FourWheeler();
        v.start();
    } 
}
