import java.awt.*;
import javax.swing.*;
public class TextAreaDemo extends JFrame{
	private DescriptionPanel descriptionPanel = new DescriptionPanel();
	public TextAreaDemo(){
		descriptionPanel.setTitle("Visual Basic 2008");
		String description = "asdsfasdfsdfasdfasdfasdfkapsdogkpasodkgpdskgpoksdgpokspadogkposkdgpksadpokfpsoadkpogkpadsokfpaosdkfpaskdpfoksapdokpgdsokpodskgpsokdapgokaspdgkap";
		descriptionPanel.setDescription(description);
		descriptionPanel.setImageIcon(new ImageIcon("aaa.png"));
		
		setLayout(new BorderLayout());
		add(descriptionPanel,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		TextAreaDemo frame = new TextAreaDemo();
		frame.pack();
		frame.setTitle("TextAreaDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}