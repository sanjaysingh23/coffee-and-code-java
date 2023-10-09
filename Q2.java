import java.util.Scanner;
public class Q2{
    public static void main(String []arrs){
        int num1;
        int num2;
        char ch;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number ");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        System.out.println("Enter the operator ");
        ch = obj.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }

    }
}