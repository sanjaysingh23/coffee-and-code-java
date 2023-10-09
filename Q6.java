import java.util.Scanner;
public class Q6{
    public static void main(String arr[]){
        int num;
        System.out.println("Enter a number ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        int i;
        for( i=2; i<num; i++){
            int flac = 0;
            for(int j=i; j>=1; j--){
                if(i%j == 0){
                    flac++;
                }
            }
            if(flac==2){
                System.out.println(i);
            }
        }
    }
}