/* 
James
2017/5/20
*/

package Login_Sys;

// ***************** All imports ************************
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;

import Travelling_Ticket.Travelling;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
// *******************************************************


public class Login_S {

	private JFrame loginFrame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.getContentPane().setBackground(SystemColor.activeCaption);
		loginFrame.setBounds(200, 200, 500, 300);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);
		
		// ************************* Instructions *********************************
		JLabel lblLoginSystems = new JLabel("Login System");
		lblLoginSystems.setFont(new Font("Old English Text MT", Font.BOLD, 22));
		lblLoginSystems.setBounds(168, 10, 136, 25);
		loginFrame.getContentPane().add(lblLoginSystems);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblUsername.setBounds(50, 69, 90, 15);
		loginFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Vivaldi", Font.BOLD, 22));
		lblPassword.setBounds(50, 140, 90, 15);
		loginFrame.getContentPane().add(lblPassword);
		// ***************************************************************
		
		
		// ******************* Enter field *******************************
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Harrington", Font.BOLD, 19));
		txtUsername.setBounds(213, 66, 145, 29);
		loginFrame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(213, 133, 145, 25);
		loginFrame.getContentPane().add(txtPassword);
		// ***************************************************************
		
		
		
		// ********************** buttons *****************************
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(SystemColor.control);
		btnLogin.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 22));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("User")&& username.contains("Pass")){
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					Travelling info = new Travelling();
					Travelling.main(null);
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		
		btnLogin.setBounds(62, 206, 93, 45);
		loginFrame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(SystemColor.control);
		btnReset.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 22));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		
		btnReset.setBounds(183, 206, 93, 45);
		loginFrame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(SystemColor.control);
		btnExit.setFont(new Font("PMingLiU-ExtB", Font.BOLD | Font.ITALIC, 22));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginFrame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(loginFrame, "Confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		// **************************************************************************
		
		// ************************ Style design **************************************
		btnExit.setBounds(301, 206, 93, 45);
		loginFrame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 189, 424, 7);
		loginFrame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 45, 424, 7);
		loginFrame.getContentPane().add(separator_1);
		// *****************************************************************************
	}
}
