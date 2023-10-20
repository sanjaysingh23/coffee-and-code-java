class Electronic_Appliance{
    void on(){

    }
    void off(){

    }
}
class TV extends Electronic_Appliance{
    void on(){
        System.out.println("Tv in on");
    }
    void off(){
        System.out.println("Tv in off");
    }
}
class Regrigerator extends Electronic_Appliance{
    void on(){
        System.out.println("Regrigerator in on");
    }
    void off(){
        System.out.println("Regrigerator in off");
    }
}
class washingMechine extends Electronic_Appliance{
    void on(){
        System.out.println("washingMechine in on");
    }
    void off(){
        System.out.println("washingMechine in off");
    }
    void fillWater(){
        System.out.println("Filling water");
    }

}
public class AnimalDemo2 {
    // static void display(Electronic_Appliance ref){
    //     if(ref instanceof washingMechine){
    //         washingMechine e = (washingMechine)ref;   //   downcasting
    //         e.fillWater();
    //     }
    //     ref.on();
    //     ref.off();
    // }
    public static void main(String arr[]){
        // display(new TV());
        // display(new Regrigerator());
        // display(new washingMechine());
        Electronic_Appliance arrElc[] = new Electronic_Appliance[3];
        arrElc[0] = new TV();
        arrElc[1] = new Regrigerator();
        arrElc[2] = new washingMechine();
        for(int i=0; i<arrElc.length; i++){
            if(arrElc[i] instanceof washingMechine){
                washingMechine w = (washingMechine)arrElc[i];   // upcasting
                w.fillWater();
            }
            arrElc[i].on();
            arrElc[i].off();

        }
    }
}
