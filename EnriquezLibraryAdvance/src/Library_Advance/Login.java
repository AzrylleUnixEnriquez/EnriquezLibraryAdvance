package Library_Advance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Login {

	private JFrame Jframe_LI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Jframe_LI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Jframe_LI = new JFrame();
		Jframe_LI.setTitle("Login Interface");
		Jframe_LI.setBounds(100, 100, 450, 300);
		Jframe_LI.setDefaultCloseOperation(Jframe_LI.EXIT_ON_CLOSE);
		Jframe_LI.getContentPane().setLayout(null);
		Jframe_LI.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 416, 243);
		Jframe_LI.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Bring the user to admin login
		JButton JbtnAdmin = new JButton("Admin Login");
		JbtnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JbtnAdmin.setBounds(132, 63, 137, 60);
		panel.add(JbtnAdmin);
		JbtnAdmin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Jframe_LI.dispose();
				AdminLogin.main(null);
				
			}
		});
		
		//Bring the user to Librarian login
		JButton JbtnLibrarian = new JButton("Librarian login");
		JbtnLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JbtnLibrarian.setBounds(132, 140, 137, 60);
		panel.add(JbtnLibrarian);
		JbtnLibrarian.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Jframe_LI.dispose();
				LibrarianLogin.main(null);
			}
		});
		
		
		JLabel JlblTitle = new JLabel("Library System");
		JlblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		JlblTitle.setBounds(147, 10, 128, 43);
		panel.add(JlblTitle);
	}
}
