import java.util.Scanner;
public class Q5{
    public static void main(String arrs[]){
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you got in exam ");
        num = obj.nextInt();
        if(num<=100 && num>=60){
            System.out.println("You got first division ");
        }
        else if(num<60 && num>=40){
            System.out.println("You got second division ");
        }
        else
            System.out.println("You fail ");

    }
}