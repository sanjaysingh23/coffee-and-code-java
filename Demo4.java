// create two classes
// 	Engine
// 		private int speed
// 		private String type
// 			setters and getters

// 	Car
// 		private Engine engine;
// 		private String modelname;
// 			setters and getters

// define class "Demo" with main
// 	inside main create object of Car and then pass Engine to its setEngine method.
// 	now serialize this object of Car and deserialize it.

import java.io.*;

class Engine implements Serializable{
    private int speed;
    private String type;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String toString (){
        return "Engine Type "+getType()+" Top Speed "+getSpeed()+" ";
    }
}
class Car implements Serializable{
    private Engine engine;
    private String modelname;
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getModelname() {
        return modelname;
    }
    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
    public String toString(){
        return "[ "+getEngine()+" Modelname "+getModelname()+"]";
    }
}
public class Demo4 {
    public static void main(String args[]){
        Car c = new Car();
        Engine e = new Engine();
        e.setSpeed(240);
        e.setType("M-Halk 4X4");
        c.setEngine(e);
        c.setModelname("Mahindra Thar");
        Car c2 = new Car();
        Engine e2 = new Engine();
        e2.setSpeed(400);
        e2.setType("Turbocharged 6-CYL");
        c2.setEngine(e2);
        c2.setModelname("Toyota Supra");
        try{
            FileOutputStream fos = new FileOutputStream("car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            oos.writeObject(c2);
            System.out.println(c);
            System.out.println(c2);
            fos.close();
            oos.close();
        }
        catch(IOException io){
            io.printStackTrace();
        }
        c = null;
        try{
            FileInputStream fis = new FileInputStream("car.txt");
            ObjectInputStream ois =  new ObjectInputStream(fis);
            try
            {
                while(true){
                Car c1 = (Car)ois.readObject();
                System.out.println(c1);
            }
            }
            catch(EOFException eof){
                System.out.println("File ended");
            }
            fis.close();
            ois.close();
        }
        catch(IOException | ClassNotFoundException io){
            io.printStackTrace();
        }
    }
}
