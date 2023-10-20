interface MouseEvent
{
	void mouseClicked();
	void mouseEntered();
	void mouseExited();
}

interface WindowEvent
{
	void windowClosing();
	void windowOpening();
}
class GuiApp implements MouseEvent, WindowEvent{
    public void mouseClicked(){
        System.out.println("Mouse clicked");
    }
    public void mouseEntered(){
        System.out.println("Mouse clicked");
    }
    public void mouseExited(){
        System.out.println("Mouse clicked");
    }
    public void windowClosing(){
        System.out.println("Mouse clicked");
    }
    public void windowOpening(){
        System.out.println("Mouse clicked");
    }
    public static void main(String arr[]){
        GuiApp g = new GuiApp();
        g.mouseClicked();
    }
    
}
