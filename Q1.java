import java.util.Scanner;
public class Q1{
    public static void main (String arr[]){
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number ");
        num = obj.nextInt();
        int total = 1;
        for(int i=1; i<=10; i++){
            total = num*i;
            System.out.println(total);
        }
    }
}