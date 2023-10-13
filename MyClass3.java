class Demo{
    private static int cnt;
    public
        void setVal(int cnt){
            this.cnt = cnt;
        }
        int getVal(){
            return cnt;
        }
}
public class MyClass3 {
    public static void main(String arr[]){
            Demo d = new Demo();
            d.setVal(30);
            System.out.println(d.getVal());
    }
}
