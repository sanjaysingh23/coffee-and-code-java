abstract class Course{
    public void start(){
        System.out.println("Course start");
    }
    public abstract double getFee();
	public abstract void evaluate();
}
class DACDBDACourse extends Course{
    double fee = 100000;
    public double getFee(){
        return fee;
    }
    public void evaluate(){
        System.out.println("DAC DBDA Evaluated");
    }
}
class MSCitCourse extends Course{
    double fee = 80000;
    public double getFee(){
        return fee;
    }
    public void evaluate(){
        System.out.println("Msc Evaluated");
    }
}
public class Demo {
    static void perform(Course ref){
        System.out.println(ref.getFee());
        ref.evaluate();
    }
    public static void main(String arr[]){
        perform(new DACDBDACourse());
        perform(new MSCitCourse());
    }
}
