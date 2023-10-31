// Define a class "Student" with
// 	private int rollno and private String name and private int age;
// 	setters and getters

// 	create 2 objects of Student and write them inside filesystem and thereafter read both the objects and display.

import java.io.*;
import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String name;
    private int age;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
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
    public String toString(){
        return "[Roll no. "+getRollno()+" Name "+getName()+" age "+getAge()+"]";
    }
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setRollno(02);
        s1.setName("Ram");
        s1.setAge(24);
        s2.setRollno(05);
        s2.setName("Sita");
        s2.setAge(22);
        System.out.println(s1);
        System.out.println(s2);
        try{
            FileOutputStream fos = new FileOutputStream("New_Student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s2);
            fos.close();
            oos.close();
        }
        catch(IOException io){
            io.printStackTrace();
        }
        s1 = null;
        s2 = null;
        try{
            FileInputStream fis = new FileInputStream("New_Student");
            ObjectInputStream ois = new ObjectInputStream(fis);
           try
           {
            while(true)
            {
                Student s3 = (Student)ois.readObject();
                System.out.println(s3);
            }
           }
            catch(EOFException e)
            {
                System.out.println("File is ended");
            }
            fis.close();
            ois.close();
        }
        catch(IOException | ClassCastException |ClassNotFoundException ce){
            ce.printStackTrace();
        }
    }
}
