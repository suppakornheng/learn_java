import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HelloAndGoodbye extends JFrame{
	private JButton helloButton;
	private JButton goodbyeButton;
	private JButton exitButton;
	private String message;
	public HelloAndGoodbye(){
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		exitButton = new JButton("Exit");
		message = "";
		setTitle("Hello and Goodbye");
		setBounds(0,0,300,300);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(helloButton);
		buttonPanel.add(goodbyeButton);
		buttonPanel.add(exitButton);
		add(buttonPanel,BorderLayout.SOUTH);
		
		helloButton.addActionListener(new ButtonListener());
		goodbyeButton.addActionListener(new ButtonListener());
		exitButton.addActionListener(new ButtonListener());
		setVisible(true);
	}
	public void paint(Graphics g){
		super.paint(g);
		Font f=new Font("Arial",Font.BOLD,16);
		g.setFont(f);
		g.drawString(message,100,100);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==helloButton){
				message = "Hello";
				repaint();
			}else if(e.getSource()==goodbyeButton){
				message = "Goodbye";
				repaint();
			}else
				System.exit(0);
		}
	}
	public static void main(String[] args){
		HelloAndGoodbye frame = new HelloAndGoodbye();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}