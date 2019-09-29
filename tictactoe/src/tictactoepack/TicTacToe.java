package tictactoepack;

import javax.swing.JFrame;

public class TicTacToe {
	
	public static void main(String args[]) {
		JFrame ticTacToe = new TicTacToeFrame();
		ticTacToe.setTitle("TicTacToe Game");
		ticTacToe.setSize(400, 400);
		ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ticTacToe.setResizable(false);
		ticTacToe.setLocationRelativeTo(null);
		ticTacToe.setVisible(true);
	}
}
