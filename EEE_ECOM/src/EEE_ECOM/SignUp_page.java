package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp_page {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_page window = new SignUp_page();
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
	public SignUp_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 255, 255));
		frame.setBounds(100, 100, 658, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    SignUp");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(235, 11, 189, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBackground(new Color(0, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setBounds(54, 105, 110, 31);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel_1 = new JLabel("Geneder");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(54, 167, 124, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(54, 225, 110, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Programming");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(54, 275, 189, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb = new JTextField();
		tb.setBounds(259, 109, 166, 34);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.setBounds(259, 167, 90, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2.setBounds(361, 167, 90, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE", "EEE", "ECE", "MECH", "CIVIL", "CSE-AIML", "CSE-DS", "CSE-CYBER SECURITY"}));
		c1.setBounds(260, 225, 164, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("Java");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		cb1.setBounds(262, 275, 69, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Python");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		cb2.setBounds(354, 275, 69, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("c");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cb3.setBounds(441, 275, 48, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected())
				{
					g="Female";
				}
				else
				{
					g="Invalid";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="java";
				}
				else if(cb2.isSelected())
				{
					p="python";
				}
				else
				{
					p="c";
				}
			JOptionPane.showMessageDialog(btnNewButton, "Hello : "+n+"\n Geneder :"+g+"\n Branch :"+b+"\n Programming :"+p);	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(197, 359, 152, 44);
		frame.getContentPane().add(btnNewButton);
	}
}
