package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 255, 204));
		frame.setBounds(100, 100, 767, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Trian Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(183, 21, 408, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(66, 124, 99, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(283, 117, 181, 31);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From Station");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(66, 166, 188, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox<?> c1 = new JComboBox<Object>();
		c1.setModel((ComboBoxModel<?>) new DefaultComboBoxModel<Object>(new String[] {"Select ", "JNTU", "KPHP", "BALNAGAR", "SR NAGAR"}));
		c1.setBounds(283, 181, 181, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("To Station");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(66, 217, 171, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox<?> c2 = new JComboBox<Object>();
		c2.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select ", "JNTU", "KPHP", "BALNAGAR", "SR NAGAR"}));
		c2.setBounds(286, 227, 178, 22);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(66, 259, 140, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox<?> c3 = new JComboBox<Object>();
		c3.setModel((ComboBoxModel<?>) new DefaultComboBoxModel<Object>(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c3.setBounds(283, 266, 181, 22);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Book Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(209, 332, 203, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
