import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawPolygon extends JFrame{
	public DrawPolygon(){
		setTitle("DrawPolygon");
		add(new PolygonsPanel());
	}
	public static void main(String[] args){
		DrawPolygon frame = new DrawPolygon();
		frame.setSize(200,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class PolygonsPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int xCenter = getWidth()/2;
		int yCenter = getHeight()/2;
		int radius = (int)(Math.min(getWidth(),getHeight())*0.4);
		Polygon polygon = new Polygon();
		polygon.addPoint(xCenter + radius, yCenter);
		int x1 = Math.round((int)(xCenter+radius)*Math.cos(2*Math.PI/6)); int y1 = Math.round((int)(yCenter-radius)*Math.cos(2*Math.PI/6));
		int x2 = Math.round((int)(xCenter+radius)*Math.cos(2*2*Math.PI/6)); int y2 = Math.round((int)(yCenter-radius)*Math.cos(2*2*Math.PI/6));
		int x3 = Math.round((int)(xCenter+radius)*Math.cos(3*2*Math.PI/6)); int y3 = Math.round((int)(yCenter-radius)*Math.cos(3*2*Math.PI/6));
		int x4 = Math.round((int)(xCenter+radius)*Math.cos(4*2*Math.PI/6)); int y4 = Math.round((int)(yCenter-radius)*Math.cos(4*2*Math.PI/6));
		int x5 = Math.round((int)(xCenter+radius)*Math.cos(5*2*Math.PI/6)); int y5 = Math.round((int)(yCenter-radius)*Math.cos(5*2*Math.PI/6));
		polygon.addPoint(x1,y1);
		polygon.addPoint(x2,y2);
		polygon.addPoint(x3,y3);
		polygon.addPoint(x4,y4);
		polygon.addPoint(x5,y5);
		g.drawPolygon(polygon);
	}
}