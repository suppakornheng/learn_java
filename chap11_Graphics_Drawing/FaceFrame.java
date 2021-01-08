import java.awt.*;
import javax.swing.*;
public class FaceFrame extends JFrame{
	public FaceFrame(String title){
		super(title);
		setBounds(0,0,400,400);
		FacePanel panel = new FacePanel();
		add(panel);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		JFrame frown = new FaceFrame("Unhappy Face");
	}
}