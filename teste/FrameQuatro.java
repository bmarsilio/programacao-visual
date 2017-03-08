import java.awt.*;

import java.awt.event.*;

public class FrameQuatro extends Frame

{

    public FrameQuatro() //construtor
    
    {
    
        addWindowListener(new WindowAdapter()
        
        {public void windowClosing(WindowEvent e){System.exit(0);}});

        Toolkit tk = Toolkit.getDefaultToolkit();
        
        Dimension d = tk.getScreenSize();
        
        setSize(d.width / 2, d.height / 2);
        
        setLocation(d.width / 4, d.height / 4);
        
        Image img = tk.getImage("teste.jpg");
        
        setIconImage(img);
        
        setTitle("Frame Quatro");
        
        setResizable(false);
    
    }
    
    public static void main (String[] args)
    
    {
    
        FrameQuatro fr = new FrameQuatro();
        
        fr.setVisible(true);
        

    }

}