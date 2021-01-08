import javax.swing.*;
import java.awt.*;
public class ColorPanel extends JPanel{
	public ColorPanel(Color backColor){
		setBackground(backColor);
	}
	//program 11.3
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//program 11.4
		int x = getWidth()/2-75;
		int y = getHeight()/2;
		
		g.setColor(Color.blue);
		g.drawRect(x,y,150,20);
		g.setColor(Color.red);
		//program 11.5
		Font font = new Font("Courier",Font.BOLD,20);
		g.setFont(font);
		g.drawString("Hello World!",x+10,y+15);
		
	}
}