class Animal{
    void makeSound(){

    }
}
class Tiger extends Animal{
    void makeSound(){
        System.out.println("Roar");
    }
    void hunt(){
        System.out.println("Hunting");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meaw");
    }
}
public class AnimalDemo{
    // static void display(Animal ref){
    //     ref.makeSound();
    //     if(ref instanceof Tiger){
    //         Tiger t = (Tiger) ref;     //  downcast
    //         t.hunt();;
    //     }
    // }
    
    public static void main(String arr[]){
        // display(new Tiger());
        // display(new Dog());
        // display(new Cat());

        Animal arrAni[] = new Animal[3];
        arrAni[0] = new Tiger();
        arrAni[1] = new Dog();
        arrAni[2] = new Cat();
        for(int i=0; i<arrAni.length; i++){
            if (arrAni[i] instanceof Tiger){
                Tiger t = (Tiger)arrAni[i];             //   downcasting
                t.hunt();
            }
            arrAni[i].makeSound();;
        }
    }
}