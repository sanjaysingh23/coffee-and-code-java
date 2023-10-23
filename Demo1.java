class MyClass{
    public String toString(){
        return "["+"Myclass"+"]";
    }
}
class Everything{
    void disp(Object ...arg){
        for(int i=0; i<arg.length; i++){
            System.out.println(arg[i]);
        }
    }
}
public class Demo1 {
    public static void main(String args[]){
        String s = "xyz";
        Everything e = new Everything();
        MyClass m = new MyClass();
        e.disp(23,"abc",s, new MyClass(),m);
    }
}
