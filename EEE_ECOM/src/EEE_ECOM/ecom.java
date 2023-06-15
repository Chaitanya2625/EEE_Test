package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 255, 204));
		frame.setBounds(100, 100, 834, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(322, 11, 161, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\Screenshot 2023-06-12 153405.png"));
		lblNewLabel_1.setBounds(35, 80, 136, 187);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\Screenshot 2023-06-12 153317.png"));
		lblNewLabel_2.setBounds(249, 80, 136, 187);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\Screenshot 2023-06-12 153907.png"));
		lblNewLabel_3.setBounds(475, 80, 126, 187);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS: 200");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(54, 294, 93, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS: 700");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(276, 294, 93, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS: 500");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(491, 294, 93, 29);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select ", "Paper", "Pdf", "Kindel"}));
		comboBox.setBounds(35, 346, 136, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select Size", "S", "M", "L"}));
		comboBox_1.setBounds(249, 346, 143, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox<?> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel((ComboBoxModel<?>) new DefaultComboBoxModel<Object>(new String[] {"Select Size", "S", "M", "L"}));
		comboBox_2.setBounds(475, 346, 148, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb.setBounds(647, 15, 161, 46);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("BILL : 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb2.setBounds(647, 67, 171, 38);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+200;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(46, 394, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+700;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(260, 394, 125, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add To Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+500;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(491, 394, 118, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
