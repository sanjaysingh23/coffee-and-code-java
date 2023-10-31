// create a customer class with following attributes
// 	custid
// 	custname
// 	address
// 	age
// create one instance of it and store it in a file. (Serialization).
// now open a file, read the object and read its contents . (Deserialization)

import java.io.*;
import java.io.Serializable;

public class Customer implements Serializable{
    int custid;
    String custname;
    String address;
    int age;
    public void setCustid(int custid) {
        this.custid = custid;
    }
    public void setCustname(String custname) {
        this.custname = custname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "[ Id is "+custid+" Name is "+custname+" Address is "+address+" Age is "+age+"]";
    }
    public static void main(String args[]){
        Customer c = new Customer();
        c.setCustid(012);
        c.setCustname("ram");
        c.setAddress("agra");
        c.setAge(24);
        try(FileOutputStream fos = new FileOutputStream("customer.txt"))
        {
            try(ObjectOutputStream oos = new ObjectOutputStream(fos))
            {
                oos.writeObject(c);
                System.out.println(c.toString());
                fos.close();
                oos.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        c = null;
        try(FileInputStream fis = new FileInputStream("customer.txt")){
            try(ObjectInputStream ois = new ObjectInputStream(fis)){
                Customer c2 = (Customer)ois.readObject();
                System.out.println(c2.toString());
                fis.close();
                ois.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

