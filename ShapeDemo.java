class Shape{
    void draw(){

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Cricle disp");
    }
}
class Polygon extends Shape{
    void draw(){
        System.out.println("Polygon disp");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle disp");
    }
}
public class ShapeDemo {
    // static void display(Shape ref){
    //     ref.draw();
    // }
    public static void main(String arr[]){
        // display(new Circle());
        // display(new Polygon());
        // display(new Rectangle());
        Shape arrShape[] = new Shape[3];
        arrShape[0] = new Circle();
        arrShape[1] = new Polygon();
        arrShape[2] = new Rectangle();
        for(int i=0; i<arrShape.length; i++){
            arrShape[i].draw();
        }
    }
}
