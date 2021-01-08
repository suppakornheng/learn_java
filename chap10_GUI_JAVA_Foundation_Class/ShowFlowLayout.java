import javax.swing.*;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame{
    public ShowFlowLayout() {
    	setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    	
    	//add component
    	add(new JLabel("First Name"));
    	add(new JTextField(8));
    	add(new JLabel("MI"));
    	add(new JTextField(1));
    	add(new JLabel("Last Name"));
    	add(new JTextField(8));
    }
    
    public static void main(String[] args){
    	ShowFlowLayout frame = new ShowFlowLayout();
    	
    	frame.setTitle("ShowFlowLayout111");
    	frame.setSize(250,150);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
    
    
}