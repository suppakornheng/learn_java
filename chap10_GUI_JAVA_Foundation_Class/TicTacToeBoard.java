import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TicTacToeBoard extends JFrame{
	private JButton resetButton;
	private JButton exitButton;
	private JButton[] board;
	private int turn;
	
	public TicTacToeBoard(){
		turn=1;
		setTitle("Tic Tac Toe");
		setBounds(0,0,300,300);
		resetButton = new JButton("Reset");
		exitButton = new JButton("Exit");
		resetButton.addActionListener(new ButtonListener());
		exitButton.addActionListener(new ButtonListener());
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(resetButton);
		bottomPanel.add(exitButton);
		
		JPanel boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(3,3));
		board = new JButton[9];
		for(int i=0;i<9;i++){
			board[i] = new JButton();
			board[i].setFont(new Font("Arial",Font.BOLD,72));
			board[i].addActionListener(new ButtonListener());
			boardPanel.add(board[i]);
		}
		add(bottomPanel,BorderLayout.SOUTH);
		add(boardPanel,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==resetButton){
				for(int i=0;i<9;i++){
					board[i].setText("");
					board[i].setEnabled(true);
					turn=1;
				}
			}else if(e.getSource()==exitButton){
				System.exit(0);
			}else{
				for(int i=0;i<9;i++){
					if(e.getSource()==board[i]){
						if(turn==1)
							board[i].setText("X");
						else
							board[i].setText("O");
						board[i].setEnabled(false);
						turn = (turn+1)%2;
						return;
					}
				}
			}
		}
	}
	public static void main(String[] args){
		TicTacToeBoard frame = new TicTacToeBoard();
	}
}