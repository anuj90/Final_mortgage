import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.rmi.MarshalException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class Mortgage {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblTotalMonthlyDebt;
	private JLabel lblInterestRate;
	private JLabel lblTerm;
	private JLabel lblDownpayment;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		final Estimatecalc ME = new Estimatecalc();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 ME.Calculate();
					Mortgage window = new Mortgage();
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
	public Mortgage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total Income");
		lblNewLabel.setBounds(36, 11, 97, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(243, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		int income = Integer.parseInt(textField_1.getText());
		
		lblTotalMonthlyDebt = new JLabel("Total Monthly debt");
		lblTotalMonthlyDebt.setBounds(36, 43, 97, 21);
		frame.getContentPane().add(lblTotalMonthlyDebt);
		
		lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setBounds(36, 75, 97, 21);
		frame.getContentPane().add(lblInterestRate);
		
		lblTerm = new JLabel("Term");
		lblTerm.setBounds(36, 107, 97, 21);
		frame.getContentPane().add(lblTerm);
		
		lblDownpayment = new JLabel("Downpayment");
		lblDownpayment.setBounds(36, 135, 97, 21);
		frame.getContentPane().add(lblDownpayment);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 43, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		int monthlydebt = Integer.parseInt(textField_1.getText());
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(243, 75, 86, 20);
		frame.getContentPane().add(textField_2);
		
	    double interest_rate = Double.parseDouble(textField_1.getText());
		
		textField_4 = new JTextField("0");
		textField_4.setColumns(10);
		textField_4.setBounds(243, 135, 86, 20);
		frame.getContentPane().add(textField_4);
		int term = Integer.parseInt(textField_1.getText());
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(66, 167, 89, 42);
		frame.getContentPane().add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(124, 230, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(301, 107, 28, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("10yr");
		comboBox.addItem("15yr");
		comboBox.addItem("30yr");
		
		lblNewLabel_1 = new JLabel("H.Payment");
		lblNewLabel_1.setBounds(24, 233, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Amt.mortgage");
		lblNewLabel_2.setBounds(229, 233, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 230, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
