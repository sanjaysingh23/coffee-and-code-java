// Person class implements Serializable with
// 	private String name
// 	private int age
// 		getters and setters
// 		parameterized constructor
// Student extends Person
// 	private int rollno
// 		getter and setters
// 		parameterized constructor accepting name,age and rollno
// 			pass name and age to the super constructor
// Demo class with main
// 	create one object of Student, write it inside file and then read.

import java.io.*;


class Person implements Serializable{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Students extends Person implements Serializable{
    private int rollno;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public Students(String name, int age, int rollno) {
        super(name, age);
        this.rollno = rollno;
    }
    public String toString(){
        return "[Name "+getName()+" Age "+getAge()+" Roll no. "+rollno +"]";
    }
}
public class Demo2  {
    public static void main(String args[]){
        Students s= new Students("Ram", 24, 02);
        
        try
        {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
                oos.writeObject(s);
                System.out.println(s);
                fos.close();
                oos.close();
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        s = null;
        try(FileInputStream fis = new FileInputStream("student.txt"))
        {
            try(ObjectInputStream ois = new ObjectInputStream(fis) )
            {
                Students s2 = (Students)ois.readObject();
                
                System.out.println(s2);
                fis.close();
                ois.close();
            }
        }
        catch(IOException |ClassNotFoundException | ClassCastException   e){
            e.printStackTrace();
        }
    }
}
