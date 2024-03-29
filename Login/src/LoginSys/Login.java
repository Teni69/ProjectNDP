package LoginSys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtAsdasd;
	private JTextField txtAsdasd_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 120, 630, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAsdasd = new JTextField();
		txtAsdasd.setFont(new Font("Monospaced", Font.BOLD, 21));
		txtAsdasd.setHorizontalAlignment(SwingConstants.CENTER);
		txtAsdasd.setText("TESZTTEXT");
		txtAsdasd.setForeground(new Color(220, 20, 60));
		txtAsdasd.setBackground(new Color(255, 250, 240));
		txtAsdasd.setBounds(130, 160, 150, 30);
		contentPane.add(txtAsdasd);
		txtAsdasd.setColumns(10);
		
		txtAsdasd_1 = new JTextField();
		txtAsdasd_1.setText("TESZTTEXT");
		txtAsdasd_1.setFont(new Font("Monospaced", Font.BOLD, 21));
		txtAsdasd_1.setForeground(new Color(30, 144, 255));
		txtAsdasd_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAsdasd_1.setBackground(new Color(255, 250, 240));
		txtAsdasd_1.setBounds(457, 160, 150, 30);
		contentPane.add(txtAsdasd_1);
		txtAsdasd_1.setColumns(10);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//KATTINTÁS EVENT				
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 240));
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnNewButton.setBounds(255, 235, 120, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblPlayer = new JLabel("PLAYER 1:");
		lblPlayer.setForeground(new Color(220, 20, 60));
		lblPlayer.setFont(new Font("SimSun", Font.BOLD, 19));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(10, 162, 110, 30);
		contentPane.add(lblPlayer);
		
		JLabel lblNewLabel = new JLabel("PLAYER 2:");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 19));
		lblNewLabel.setBounds(337, 162, 110, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblTictactoe = new JLabel("TICTACTOE");
		lblTictactoe.setForeground(new Color(0, 0, 128));
		lblTictactoe.setFont(new Font("Sylfaen", Font.BOLD, 31));
		lblTictactoe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoe.setBounds(215, 11, 200, 47);
		contentPane.add(lblTictactoe);
		
		setUndecorated(true); //Keret eltüntetése
	}
}
