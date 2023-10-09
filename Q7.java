public class Q7 {
    public static void main(String arr[]){
        char ch1 ='A';
        char ch2 = 'a';
        char ch3 = 'B';
        char ch4 = 'C';
        for(int i=0; i<3; i++){
            System.out.print(ch1+"   ");
            System.out.println(ch2++);
        }
        System.out.println();
        ch2 = 'a';
        for(int i=0; i<3; i++){
            System.out.print(ch3+"   ");
            System.out.println(ch2++);
        }
        System.out.println();
        ch2 = 'a';
        for(int i=0; i<3; i++){
            System.out.print(ch4+"   ");
            System.out.println(ch2++);
        }
    }
}
