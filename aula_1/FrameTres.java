import java.awt.*;

import java.awt.event.*;

public class FrameTres extends Frame

{

    public FrameTres() //construtor
    
    {
    
        addWindowListener(new WindowAdapter()
        
        {public void windowClosing(WindowEvent e){System.exit(0);}});
        
        setTitle("Frame Três"); // título do Frame
        
        setSize(300, 200); // largura: 300 pixels altura: 200 pixels
        
        setResizable(false); // não permite o redimensionamento
        
        setLocation(200, 100); // x: 200 pixels y: 100 pixels
        
    }
    
    public static void main (String[] args)
    
    {
    
        FrameTres fr = new FrameTres();
        
        fr.setVisible(true);
        
    }

}