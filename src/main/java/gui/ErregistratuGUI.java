package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import businessLogic.BLFacade;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;

public class ErregistratuGUI extends JFrame{
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	
	 private static BLFacade appFacadeInterface;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JPasswordField passwordField_1;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
		
		public static BLFacade getBusinessLogic(){
			return appFacadeInterface;
		}
		 
		public static void setBussinessLogic (BLFacade afi){
			appFacadeInterface=afi;
		}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErregistratuGUI frame = new ErregistratuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ErregistratuGUI() {
		setTitle(ResourceBundle.getBundle("Etiquetas").getString("Register"));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Username"));
		lblNewLabel.setBounds(6, 52, 153, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Password"));
		

		lblNewLabel_1.setBounds(6, 110, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 134, 162, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(158, 49, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(ResourceBundle.getBundle("Etiquetas").getString("User"));
		rdbtnNewRadioButton.setBounds(204, 235, 116, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(ResourceBundle.getBundle("Etiquetas").getString("Admin"));
		rdbtnNewRadioButton_1.setBounds(57, 235, 135, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton(ResourceBundle.getBundle("Etiquetas").getString("Register"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame a = new LoginGUI();

				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(317, 249, 127, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RepeatPassword"));
		lblNewLabel_2.setBounds(6, 136, 153, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Emailaddress"));
		lblNewLabel_3.setBounds(6, 82, 153, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Name"));
		lblNewLabel_4.setBounds(6, 24, 153, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 22, 162, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(158, 80, 162, 20);
		contentPane.add(textField_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(158, 107, 162, 20);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("BirthDay"));
		lblNewLabel_5.setBounds(6, 164, 127, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Day"));
		lblNewLabel_6.setBounds(6, 192, 79, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Month"));
		lblNewLabel_6_1.setBounds(147, 191, 73, 16);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("Year"));
		lblNewLabel_6_2.setBounds(287, 191, 79, 16);
		contentPane.add(lblNewLabel_6_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(81, 192, 67, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(221, 189, 67, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(361, 187, 67, 24);
		contentPane.add(textField_5);
	}
}



