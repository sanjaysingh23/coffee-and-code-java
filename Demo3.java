interface Addition{
    void add(int x, int y);
}
public class Demo3 {
    void calc(int a, int b){
        System.out.println("Addition is "+ (a+b));
    }
    public static void main(String args[]){
        Demo3 d = new Demo3();
        Addition ref1 = (i,j) -> {d.calc(50, 50);};
        ref1.add(20,20);
        // System.out.println(ref1);
        Addition ref2 = d::calc;
        ref2.add(10, 20);
    }
}
