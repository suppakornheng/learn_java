import java.awt.*;
import javax.swing.*;
public class AlphabetButtons extends JFrame{
	public AlphabetButtons(int width, int height){
		super("Alphabet Buttons");
		setLayout(new FlowLayout());
		setBounds(0,0,width,height);
		for(int i=0;i<26;i++){
			Character letter = (char)(i+'A');
			JButton button = new JButton(letter.toString());
			this.add(button);
		}
	}
	public static void main(String[] args){
		JFrame frame = new AlphabetButtons(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}