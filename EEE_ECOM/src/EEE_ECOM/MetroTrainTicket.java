package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class MetroTrainTicket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTrainTicket window = new MetroTrainTicket();
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
	public MetroTrainTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 255, 204));
		frame.setBounds(100, 100, 666, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Train Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(77, 28, 442, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(54, 122, 103, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(296, 122, 165, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From Station");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(54, 173, 185, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "JNTU", "KPHP", "BALNAGAR", "MOOSAPET", "SR NAGAR", "BHARTH NAGAR"}));
		c1.setBounds(296, 181, 165, 22);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("To Station");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(54, 224, 165, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "JNTU", "KPHP", "BALNAGAR", "MOOSAPET", "SR NAGAR", "BHARTH NAGAR"}));
		c2.setBounds(296, 232, 165, 22);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(54, 272, 123, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\Screenshot 2023-06-13 121938.png"));
		lblNewLabel_5.setBounds(519, 11, 121, 119);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c3.setBounds(297, 282, 164, 22);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Book Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fr=(String) c1.getSelectedItem();
				String to=(String) c2.getSelectedItem();
				String ticket=(String) c3.getSelectedItem();
				int t=Integer.parseInt(ticket);
				int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton, "Hello "+pn+"\n Form : "+fr+"\n To : "+to+"\n Ticket : "+t+"\n Bill : "+bill+);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(185, 341, 210, 39);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
