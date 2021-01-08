import javax.swing.*;
public class MyFrame{
	public static void main(String[] args){
		/*
		//program 10.1
		JFrame frame = new JFrame("My Frame");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);	// set file's location to the center of your monitor.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		*/
		
		//program 10.2
		JFrame frame = new JFrame("MyFrameWithComponent");
		JButton jbtOK = new JButton("OK");
		frame.add(jbtOK);
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}