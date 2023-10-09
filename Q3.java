import java.util.Scanner;
public class Q3{
    public static void main(String arrs[]){
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = obj.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(i);
        }
    }
}