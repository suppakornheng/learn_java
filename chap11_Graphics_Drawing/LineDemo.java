import javax.swing.*;
import java.awt.*;
public class LineDemo extends JApplet{
	public void init(){
		getContentPane().setBackground(Color.yellow);
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("Show Line",100,20);
		g.setColor(Color.red);
		g.drawLine(20,20,280,280);
		g.setColor(Color.blue);
		g.drawLine(280,20,20,280);
	}
}