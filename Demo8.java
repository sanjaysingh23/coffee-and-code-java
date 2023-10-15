class Parent{
    void disp1(int x){
        System.out.println("Parent disp1 "+x);
    }
}
class child extends Parent{
    void disp1(int y, int z){
        System.out.println("Child disp1 "+y+" "+z);
    }
}
public class Demo8 {
    public static void main(String arr[]){
        child c1 = new child();
        c1.disp1(800);
        c1.disp1(30,88);
        
    }
}
