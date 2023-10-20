abstract class Person{
    void walk(){
        System.out.println("Walk");
    }
    void talk(){
        System.out.println("Talk");
    }
    void eat(){
        System.out.println("Eat");
    }
    abstract void performDuties();
}
class Teacher extends Person{
    void talk(){
        System.out.println("Talk gentaly");
    }
    void performDuties(){
        System.out.println("Teaching");
    }
}
class soldier extends Person{
    void walk(){
        System.out.println("Walk fast");
    }
void performDuties(){
        System.out.println("Secure border");
    }
}
public class DemoPerson {
    static void display(Person ref){
        ref.eat();
        ref.talk();
        ref.walk();
        ref.performDuties();
    }
    public static void main(String arr[]){
        // Teacher t = new Teacher();
        // soldier s = new soldier();
        // t.eat();
        // t.talk();
        // t.walk();
        // s.eat();
        // s.talk();
        // s.walk();
        display(new soldier());
        display(new Teacher());
        // Person arrPer[] = new Person[2];
        // arrPer[0] = new Teacher();
        // arrPer[1] = new soldier();
        // for(int i=0; i<arrPer.length; i++){
        //     display(arrPer[i]);
        // } 

    }
}
