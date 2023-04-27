package Library_Advance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {

	private JFrame Jframe_Admin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.Jframe_Admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Jframe_Admin = new JFrame();
		Jframe_Admin.setTitle("WELCOME");
		Jframe_Admin.setBounds(100, 100, 450, 300);
		Jframe_Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe_Admin.getContentPane().setLayout(null);
		Jframe_Admin.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 416, 243);
		Jframe_Admin.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Display a message 
		JLabel JlblMessage = new JLabel("WELCOME ADMIN");
		JlblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		JlblMessage.setFont(new Font("Tahoma", Font.BOLD, 20));
		JlblMessage.setBounds(10, 10, 396, 200);
		panel.add(JlblMessage);
		
		JButton JbtnLogout = new JButton("Logout");
		JbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jframe_Admin.setVisible(false);
				Login.main(null);
			}
		});
		JbtnLogout.setBounds(321, 203, 85, 30);
		panel.add(JbtnLogout);
	}
}
