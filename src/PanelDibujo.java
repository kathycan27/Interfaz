import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);

        int anchura=getWidth();
        int altura=getHeight();
        g.drawLine(100,0,100,100);
        //g.drawLine(110,5,110,110);
       // g.drawLine(100,0,110,5);
        g.drawLine(150,0,100,50);
        g.drawLine(100,50,150,100);
        g.draw3DRect(150,0,7,100,true);
        g.draw3DRect(200,0,7,50,true);

    }
}
