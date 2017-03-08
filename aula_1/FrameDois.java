import java.awt.*;

public class FrameDois extends Frame

{

    public FrameDois() //construtor
    
    {
    
        setTitle("Frame Dois"); // título do Frame
        
        setSize(300, 200); // largura: 300 pixels altura: 200 pixels
        
        setResizable(false); // não permite o redimensionamento
        
        
        
        setLocation(200, 100); // x: 200 pixels y: 100 pixels
        
    }
    
    public static void main (String[] args)
    
    {
    
        FrameDois fr = new FrameDois();
        
        fr.setVisible(true);
    
    }

}