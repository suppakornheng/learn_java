import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ControlCircle1 extends JFrame{
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	public ControlCircle1(){
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		//program 11.16
		jbtEnlarge.addActionListener(new EnlargeListener());
		jbtShrink.addActionListener(new ShrinkListener());
	}
	class EnlargeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.enlarge();
		}
	}
	class ShrinkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.shrink();
		}
	}
	public static void main(String[] args){
		JFrame frame = new ControlCircle1();
		frame.setTitle("ControlCircle1");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	class CirclePanel extends JPanel{
		private int radius =5;
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawOval(getWidth()/2-radius, getHeight()/2-radius, 2*radius, 2*radius);
		}
		//program 11.6
		public void enlarge(){
			radius++;
			repaint();
		}
		public void shrink(){
			radius--;
			repaint();
		}
	}
}