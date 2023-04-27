package Library_Advance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class AdminLogin {

	private static JFrame Jframe_AL;
	private static JTextField txtUsername;
	private static JPasswordField Jpfpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.Jframe_AL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void initialize() {
		Jframe_AL = new JFrame();
		Jframe_AL.setTitle("Admin Login");
		Jframe_AL.setBounds(100, 100, 450, 300);
		Jframe_AL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe_AL.getContentPane().setLayout(null);
		Jframe_AL.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		Jframe_AL.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername.setBounds(108, 84, 221, 27);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel JlblUsername = new JLabel("Username:");
		JlblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlblUsername.setBounds(24, 92, 74, 16);
		panel.add(JlblUsername);
		
		Jpfpass = new JPasswordField();
		Jpfpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jpfpass.setBounds(108, 133, 218, 27);
		panel.add(Jpfpass);
		
		JLabel JlblPassword = new JLabel("Password:");
		JlblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlblPassword.setBounds(24, 141, 65, 16);
		panel.add(JlblPassword);
		
		JLabel JlblTitle = new JLabel("ADMIN LOGIN");
		JlblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		JlblTitle.setBounds(135, 8, 140, 39);
		panel.add(JlblTitle);
		

		//Login button and checker of user, redirects to the admin interface
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(330, 218, 96, 35);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] user = {"Admin_01", "Admin_02", "Admin_03"};
				String[] pass = {"AdminOne", "AdminTwo", "AdminThree"};
				
				String Username = txtUsername.getText();
				String Password = Jpfpass.getText();
				
			//Username and Password checker	
				for(int i = 0; i <= user.length-1; i++) {
					if(Username.equals(user[i])&& Password.equals(pass[i])) {
						JOptionPane.showMessageDialog(null, "Succesfully login");
						Admin.main(null);
						Jframe_AL.dispose();
					}
					}
				
			//Input checker
				if(Username.equals("") && Password.equals("")) {
					JOptionPane.showMessageDialog(null, " Input Username and password");
				}else if (Username.equals("")) {
					JOptionPane.showMessageDialog(null, " Input Username");
				}else if (Password.equals("")) {
					JOptionPane.showMessageDialog(null, " Input Password");
				}
				else if(Username.equals(user[0])&& !Password.equals(pass[0])||
						Username.equals(user[1])&& !Password.equals(pass[1])||
						Username.equals(user[2])&& !Password.equals(pass[2])) {
					JOptionPane.showMessageDialog(null, " Incorrect Password");
				}
				else if(!Username.equals(user[0])&& Password.equals(pass[0])||
						!Username.equals(user[1])&& Password.equals(pass[1])||
						!Username.equals(user[2])&& Password.equals(pass[2])) {
					JOptionPane.showMessageDialog(null, " Incorrect Username");
				}
				else if(!Username.equals(user[0])&& !Password.equals(pass[0])&&
						!Username.equals(user[1])&& !Password.equals(pass[1]) && 
						!Username.equals(user[2])&& !Password.equals(pass[2])) {
					JOptionPane.showMessageDialog(null, " Incorrect, Check your Username and Password");
				}
				
					
				
			}
		});
		
		
		
	}
}
