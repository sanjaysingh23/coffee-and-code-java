interface Third{
    void show(int n);
}
public class Sample {
    void disp(int x){
        System.out.println("In disp "+x);
    }
    public static void main(String args[]){
        Sample s = new Sample();
        Third ref = s::disp;
        ref.show(10);
    }
}
