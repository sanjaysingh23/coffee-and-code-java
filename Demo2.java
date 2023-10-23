 class Sample {
    char ch;
    Sample(char ch){
        this.ch = ch;
    }
    public int hashCode(){
        return Character.hashCode(ch);
    }
    public String toString(){
        return String.valueOf(ch);
    }
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            System.out.println("inside true");
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            System.out.println("inside false");
            return false;
        }

        Sample ref = (Sample)obj;
        return ch == ref.ch; 
        
    }
   
}
public class Demo2
{
     public static void main(String arr[]){
        Demo2 d2 = new Demo2();
        Sample s1 = new Sample('A');
        Sample s2 = new Sample('A');
        // System.out.println(s1.ch);
        // System.out.println(s2.ch);
        System.out.println(s1);
        System.out.println(s2);

        s1.equals(d2);

        if(s1.equals(s1)){
            System.out.println("True");
            System.out.println(s1.hashCode()+" "+s2.hashCode());
        }
        else{
            System.out.println("False");
            System.out.println(s1.hashCode()+" "+s2.hashCode());
            System.out.println("Both passed charactors are different");
        }
    }
}