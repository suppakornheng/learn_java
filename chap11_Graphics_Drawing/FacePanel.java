import java.awt.*;
import javax.swing.*;
public class FacePanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Font font = new Font("Comic Sans Serif",Font.BOLD,16);
		g.setFont(font);
		setBackground(Color.white);
		g.setColor(Color.YELLOW);
		g.fillOval(50,50,200,200);
		
		g.setColor(Color.black);
		g.fillOval(100,100,25,25);
		g.fillOval(150,100,25,25);
		
		g.drawLine(125,135,100,160);
		g.drawLine(100,160,120,160);
		
		g.drawArc(75,175,100,40,170,200);
		g.drawString("\"Start everyday off with a smile--",20,20);
		g.drawString("and get it over with\"--W.C.Fields",20,300);
	}
}