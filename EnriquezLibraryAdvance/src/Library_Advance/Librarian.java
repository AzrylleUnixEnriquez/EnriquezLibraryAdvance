package Library_Advance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Librarian {

	private JFrame Jframe_Librarian;
	private JTextField JtxtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarian window = new Librarian();
					window.Jframe_Librarian.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Librarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Jframe_Librarian = new JFrame();
		Jframe_Librarian.setTitle("LIBRARY");
		Jframe_Librarian.setBounds(100, 100, 749, 370);
		Jframe_Librarian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jframe_Librarian.getContentPane().setLayout(null);
		Jframe_Librarian.setLocationRelativeTo(null);
		
		
		
		ArrayList<Books> books = new ArrayList<>();
		
		
		Books book1 = new Books();
		book1.name = "System Analysis and Design";
		book1.author = "Gary B. Shelly";
		book1.copy = 2;
		
		Books book2 = new Books();
		book2.name = "Android Application";
		book2.author = "Corine Hoisington";
		book2.copy = 3;
		
		Books book3 = new Books();
		book3.name = "Programming Concepts and Logic Formulation";
		book3.author = "Rosauro E. Manuel";
		book3.copy = 4;
		
		//ArrayList add method to add to the books to the ArrayList
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		JPanel Jpanel = new JPanel();
		Jpanel.setBounds(0, 0, 735, 436);
		Jframe_Librarian.getContentPane().add(Jpanel);
		Jpanel.setLayout(null);
		
		JButton JbtnLogout = new JButton("logout");
		JbtnLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JbtnLogout.setBounds(624, 10, 85, 33);
		Jpanel.add(JbtnLogout);
		
		JLabel lblCopies = new JLabel("COPIES");
		lblCopies.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopies.setBounds(421, 67, 56, 13);
		Jpanel.add(lblCopies);
		
		JLabel lblCopies1 = new JLabel("2");
		lblCopies1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCopies1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopies1.setBounds(432, 90, 45, 13);
		Jpanel.add(lblCopies1);
		
		JLabel lblCopies2 = new JLabel("3");
		lblCopies2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCopies2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopies2.setBounds(432, 110, 45, 13);
		Jpanel.add(lblCopies2);
		
		JLabel lblCopies3 = new JLabel("4");
		lblCopies3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCopies3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopies3.setBounds(432, 130, 45, 13);
		Jpanel.add(lblCopies3);
		
		JTextArea txtrBook = new JTextArea();
		txtrBook.setBounds(31, 61, 494, 147);
		Jpanel.add(txtrBook);
		txtrBook.setText("Books"+"\r\n\r\n"+ "[0]" + book1.name +", by "+ book1.author + "\r\n[1]"
				+ book2.name +", by "+ book2.author +"\r\n[2]"
				+ book3.name +", by "+ book3.author
				+ " \r\n\r\n\r\n\r\nInput the number of the book that you want to rent:");
		
		
		JtxtInput = new JTextField();
		JtxtInput.setBounds(194, 224, 96, 33);
		Jpanel.add(JtxtInput);
		JtxtInput.setColumns(10);
		
		JLabel JlblInput = new JLabel("Input:");
		JlblInput.setBounds(128, 228, 56, 23);
		Jpanel.add(JlblInput);
		JlblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		JLabel Jlbltitle = new JLabel("LIBRARY RENT");
		Jlbltitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		Jlbltitle.setBounds(41, 10, 290, 41);
		Jpanel.add(Jlbltitle);
		
		JButton JbtnRent = new JButton("Rent");
		JbtnRent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JbtnRent.setBounds(421, 224, 85, 33);
		Jpanel.add(JbtnRent);
		
		//Rent button
		JbtnRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					int input = Integer.parseInt(JtxtInput.getText());
					
					//Checker of copies 
					if(input == 0 && book1.copy<1) {
					int	choice = JOptionPane.showConfirmDialog(null, "No more copies available, Rent again?", "", JOptionPane.YES_NO_OPTION);
						if(choice == JOptionPane.YES_OPTION) {
						Jframe_Librarian.setVisible(true);
						JtxtInput.setText(null);
						}else {
						Jframe_Librarian.dispose();
						Login.main(null);
					}
					}
					
					
					if(input == 1 && book2.copy<1) {
					int	choice = JOptionPane.showConfirmDialog(null, "No more copies available, Rent again?","", JOptionPane.YES_NO_OPTION);
						if(choice == JOptionPane.YES_OPTION) {
						Jframe_Librarian.setVisible(true);
						JtxtInput.setText(null);
						}else {
						Jframe_Librarian.dispose();
						Login.main(null);
					}
					}
					
					if(input == 2 && book3.copy<1) {
					int	choice = JOptionPane.showConfirmDialog(null, "No more copies available, Rent again?","", JOptionPane.YES_NO_OPTION);
						if(choice == JOptionPane.YES_OPTION) {
						Jframe_Librarian.setVisible(true);
						JtxtInput.setText(null);
						}else {
						Jframe_Librarian.dispose();
						Login.main(null);
					}
					}
					//checker of Borrowed copies of books
					if(input == 0 && book1.copy>0){
						int choice = JOptionPane.showConfirmDialog(null, "You have chosen: "+ 
						books.get(input).getName()+ " by " + books.get(input).getAuthor(),"", JOptionPane.YES_NO_OPTION);
					
						if(choice == JOptionPane.YES_OPTION){
							book1.copy -= 1;
							lblCopies1.setText(Integer.toString(book1.copy));
							int Option = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "", JOptionPane.YES_NO_OPTION);
							if(Option == JOptionPane.YES_OPTION) {
								Jframe_Librarian.setVisible(true);
								JtxtInput.setText(null);
							}else {
								Jframe_Librarian.dispose();
								Login.main(null);
							}
						}
					
					}else if(input == 1 && book2.copy>0){
						int choice = JOptionPane.showConfirmDialog(null, "You have chosen: "+ 
						books.get(input).getName()+ " by " + books.get(input).getAuthor(),"", JOptionPane.YES_NO_OPTION);
						
						if(choice == JOptionPane.YES_OPTION){
							book2.copy -= 1;
							lblCopies2.setText(Integer.toString(book2.copy));
							int Option = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "", JOptionPane.YES_NO_OPTION);
							if(Option == JOptionPane.YES_OPTION) {
								Jframe_Librarian.setVisible(true);
								JtxtInput.setText(null);
						}else {
							Jframe_Librarian.dispose();
							Login.main(null);
							}
						}
						
				    }else if(input == 2 && book3.copy>0){
						int choice = JOptionPane.showConfirmDialog(null, "You have chosen: "+ 
						books.get(input).getName()+ " by " + books.get(input).getAuthor(),"", JOptionPane.YES_NO_OPTION);
						
						if(choice == JOptionPane.YES_OPTION){
							book3.copy -= 1;
							lblCopies3.setText(Integer.toString(book3.copy));
							int Option = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "", JOptionPane.YES_NO_OPTION);
							if(Option == JOptionPane.YES_OPTION) {
								Jframe_Librarian.setVisible(true);
								JtxtInput.setText(null);
						}else {
							Jframe_Librarian.dispose();
							Login.main(null);
							}
						}
				    }
					//catch(OutOfBoundsException ex) does not work, can't find the problem
					//Checker if your input is in the index
					if(input < 0 || input > books.size()) {
						JOptionPane.showConfirmDialog(null, "Index does not exist.", "",JOptionPane.CLOSED_OPTION);
						JtxtInput.setText(null);
					}
							
					 //Checker if your input is a number
				}catch(NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Input must be in the choices.","",
							JOptionPane.CLOSED_OPTION);
					JtxtInput.setText(null);
					
				}
				
				}
		});
		//Button for logout that redirects back to the login interface
		JbtnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jframe_Librarian.setVisible(false);
				Login.main(null);
			}
		});
	}
}
