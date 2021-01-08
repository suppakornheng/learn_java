import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LoanCalculator extends JFrame{
	private JTextField amountField;
	private JTextField interestField;
	private JTextField yearsField;
	private JTextField paymentField;
	private JButton submitButton;
	private JButton clearButton;
	private JButton exitButton;
	
	public LoanCalculator(){
		super("Monthly Payment");
		setBounds(0,0,220,200);
		JPanel panel = new JPanel();
		
		JLabel amountLabel = new JLabel();
		amountLabel.setFont(new Font("Courier",Font.BOLD,12));
		amountLabel.setText(" Amount:");
		amountField = new JTextField(10);
		panel.add(amountLabel);
		panel.add(amountField);
		
		JLabel interestLabel = new JLabel();
		interestLabel.setFont(new Font("Courier",Font.BOLD,12));
		interestLabel.setText("Interest:");
		interestField = new JTextField(10);
		panel.add(interestLabel);
		panel.add(interestField);
		
		JLabel yearsLabel = new JLabel();
		yearsLabel.setFont(new Font("Courier",Font.BOLD,12));
		yearsLabel.setText(" Years:");
		yearsField = new JTextField(10);
		panel.add(yearsLabel);
		panel.add(yearsField);
		JLabel paymentLabel = new JLabel();
		paymentLabel.setFont(new Font("Courier",Font.BOLD,12));
		paymentLabel.setText(" Payment:");
		paymentField = new JTextField(10);
		panel.add(paymentLabel);
		panel.add(paymentField);
		paymentField.setEditable(false);
		
		add(panel,BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		submitButton = new JButton("Submit");
		exitButton = new JButton("Exit");
		clearButton = new JButton("Clear");
		buttonPanel.add(submitButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(exitButton);
		add(buttonPanel,BorderLayout.SOUTH);
		
		submitButton.addActionListener(new ButtonListener());
		clearButton.addActionListener(new ButtonListener());
		exitButton.addActionListener(new ButtonListener());
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==submitButton){
				try{
					double amount = Double.parseDouble(amountField.getText());
					double interest = Double.parseDouble(interestField.getText());
					double years = Double.parseDouble(yearsField.getText());
					double payment = LoanPayment.getPayment(amount,interest,years);
					paymentField.setText(payment+"");
				}catch(NumberFormatException ex){
					paymentField.setText("Illegal Input");
				}
			}else if(e.getSource()==clearButton){
				amountField.setText("");
				interestField.setText("");
				yearsField.setText("");
				paymentField.setText("");
			}else{
				System.exit(0);
			}
		}
	}
	public static void main(String[] args){
		LoanCalculator frame = new LoanCalculator();
	}
}