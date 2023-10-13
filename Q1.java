class Shape{
    private
        int height;
        int weight;
    public
        void setHeight(int height){
            this.height = height;
        }
        void setWeight(int weight){
            this.weight = weight;
        }
        int getHeight(){
            return height;
        }
        int getWeight(){
            return weight;
        }
} 
public class Q1{
    public static void main(String arr[]){
        Shape s = new Shape();
        s.setHeight(178);
        s.setWeight(65);
        System.out.println(s.getHeight()); 
        System.out.println(s.getWeight());
    }
}
