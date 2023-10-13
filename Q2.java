class Mycls{
    public
        Mycls(){
                System.out.println("default");
            }
        Mycls(int num1){ 
                System.out.println("one param");
                System.out.println(num1);

            }
        Mycls(int num1,int num2){
                System.out.println("two param");
                System.out.println(num1+" "+num2);

            }
}
public class Q2 {

    public static void main(String arr[]){
       Mycls obj1 = new Mycls();
       Mycls obj2 = new Mycls(23);
       Mycls obj3 = new Mycls(2,29);

    }
}
