class Artist{
    void perform(){
        System.out.println("Artist perform");
    }
}
class Actor extends Artist{
    void perform(){
        System.out.println("Actor perform");
    }
    void changeGateUp(){
        System.out.println("As per the role demand");
    }
}
class Singer extends Artist{
    void perform(){
        System.out.println("Singer perform");
    }
}
class Musician extends Artist{
    void perform(){
        System.out.println("Musician perform");
    }
}

public class Demo4 {
    public static void main(String arr[]){
        Artist arrArtist[] = new Artist[3];
        arrArtist[0] = new Actor();
        arrArtist[1] = new Singer();
        arrArtist[2] = new Musician();
        for(int i=0; i<arrArtist.length;i++){
            arrArtist[i].perform();
            if(arrArtist[i] instanceof Actor){
                Actor ref = (Actor)arrArtist[i];
                ref.changeGateUp();
            }
        }
    }
    
}
