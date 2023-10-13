public class DemoOb {
    private int num ;
        public
            DemoOb(int num){
                this.num = num;
            }
            void setVal(int num){
                this.num = num;
            }
            int getVal(){
                return num;
            }
    public static void main(String arr[]){
        DemoOb obj = new DemoOb(50);
        DemoOb ref = obj; 
        DemoOb ref2 = ref;
        System.out.println(obj.getVal());
        obj.setVal(100);
        System.out.println(obj.getVal());
        System.out.println(ref.getVal());
        System.out.println(ref2.getVal());
        ref2.setVal(200);
        System.out.println(ref2.getVal());
    }
}
