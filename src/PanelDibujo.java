import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);

        int anchura=getWidth();
        int altura=getHeight();
        g.drawLine(20,5,20,100);
        g.drawLine(50,5,20,50);
        g.drawLine(20,50,50,100);
       // g.draw3DRect(150,0,7,100,true);
       // g.draw3DRect(200,0,7,50,true);
        //g.drawPolygon(int[] xPoints, int[] yPoints, int nPoints);
        int i = 4;
        //g.drawPolygon(4,8,10);
        String[] fonts = getToolkit().getFontList();
        g.setFont(new Font(fonts[0],Font.BOLD,40));
       // g.drawString("Kathy",200,125);

        g.setColor(Color.blue);

        int x[] = {75,75,100,100,100,140,160,120,120,160,140,100,100,75,0,0};
        int y[] = {10, 150, 150, 85, 85, 150, 150,85,85,10,10,75,10,10,0,0 };
        g.drawPolygon(x,y,13);
    }
}
