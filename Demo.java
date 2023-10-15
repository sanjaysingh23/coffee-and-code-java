class MyClass{
    int x, y, z;
    MyClass(){
        System.out.println("no param ");
    }
    MyClass(int x){
        this.x = x;
        System.out.println("1 param "+x);
    }
    MyClass(int y, int z){
        this.y = y;
        this.z = z;
        System.out.println("2 param "+(y+z));
    }
    void disp(){
        System.out.println("In disp func "+ x +" "+ y +" " + z);
    }
}
public class Demo {
    public static void main(String arr[]){
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass(30);
        MyClass m3 = new MyClass(50,100);
        m1.disp();
        m2.disp();
        m3.disp();
    }
}
