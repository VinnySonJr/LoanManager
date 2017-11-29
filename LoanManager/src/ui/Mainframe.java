package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Mainframe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe frame = new Mainframe();
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
	public Mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBank = new JLabel("Bank");
		lblBank.setBounds(55, 39, 46, 14);
		contentPane.add(lblBank);
		
		JLabel lblLoanType = new JLabel("Loan Type");
		lblLoanType.setBounds(55, 75, 57, 14);
		contentPane.add(lblLoanType);
		
		JLabel lblIntrestRate = new JLabel("Intrest Rate");
		lblIntrestRate.setBounds(55, 118, 82, 14);
		contentPane.add(lblIntrestRate);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(55, 157, 46, 14);
		contentPane.add(lblYears);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalculate.setBounds(172, 214, 89, 23);
		contentPane.add(btnCalculate);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 36, 103, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(172, 72, 103, 20);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(172, 115, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 154, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
