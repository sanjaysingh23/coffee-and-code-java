interface Vehical{
    void start();
}
class TwoWheeler implements Vehical{
    public void start(){
        System.out.println("Two Wheelar start");
    }
}
class ThreeWheelar implements Vehical{
    public void start(){
        System.err.println("Three Wheelar start");
    }
}
class FourWheelar implements Vehical{
    public void start(){
        System.out.println("Four Wheeler start");
    }
}
public class VDemo {
    // static void display(Vehical ref){
    //     ref.start();
    // }
    public static void main(String arr[]){
        // display(new TwoWheeler());
        // display(new ThreeWheelar());
        // display(new FourWheelar());
        Vehical arrVehical[] = new Vehical[3];
        arrVehical[0] = new TwoWheeler();
        arrVehical[1] = new ThreeWheelar();
        arrVehical[2] = new FourWheelar();
        for(int i=0;i<arrVehical.length;i++){
            arrVehical[i].start();
        }
    }
}
