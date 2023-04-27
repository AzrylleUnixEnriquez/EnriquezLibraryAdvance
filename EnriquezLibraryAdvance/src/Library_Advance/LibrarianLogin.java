package Library_Advance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianLogin {

	private JFrame Jframe_LL;
	private JTextField txtUsername;
	private JPasswordField Jpfpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin window = new LibrarianLogin();
					window.Jframe_LL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Jframe_LL = new JFrame();
		Jframe_LL.setBounds(100, 100, 450, 300);
		Jframe_LL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe_LL.getContentPane().setLayout(null);
		Jframe_LL.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 436, 263);
		Jframe_LL.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername.setColumns(10);
		txtUsername.setBounds(108, 84, 221, 27);
		panel.add(txtUsername);
		
		Jpfpass = new JPasswordField();
		Jpfpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Jpfpass.setBounds(108, 133, 218, 27);
		panel.add(Jpfpass);
		
		JLabel JlblLibLogin = new JLabel("LIBRARIAN LOGIN");
		JlblLibLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		JlblLibLogin.setBounds(118, 10, 208, 39);
		panel.add(JlblLibLogin);
		
		
		
		JLabel JlblUsername = new JLabel("Username:");
		JlblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlblUsername.setBounds(24, 92, 74, 16);
		panel.add(JlblUsername);
		
		JLabel JlblPassword = new JLabel("Password:");
		JlblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JlblPassword.setBounds(24, 141, 65, 16);
		panel.add(JlblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(330, 218, 96, 35);
		panel.add(btnLogin);
		
		
		//Login button and checker of user, redirects to the Librarian interface
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] user = {"Librarian_01", "Librarian_02", "Librarian_03"};
				String[] pass = {"LibOne", "LibTwo", "LibThree"};
				
				String Username = txtUsername.getText();
				String Password = Jpfpass.getText();
				
			//Username and Password checker	
				for(int i = 0; i <= user.length-1; i++) {
					if(Username.equals(user[i])&& Password.equals(pass[i])) {
						JOptionPane.showMessageDialog(null, "Succesfully login");
						Librarian.main(null);
						Jframe_LL.dispose();
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
