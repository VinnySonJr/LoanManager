package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logic.Bank;
import logic.IBank;
import logic.Loan;
import dataManagement.DataManager;

public class Mainframe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JFrame currentFrame;

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
		DataManager dm = new DataManager();
		this.currentFrame = this;
		currentFrame.setTitle("Montly Loan Calculator");
		final TreeMap<String,String> dataMap = dm.readFile();
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
		
		JLabel lblIntrestRate = new JLabel("Loan Amount");
		lblIntrestRate.setBounds(55, 118, 82, 14);
		contentPane.add(lblIntrestRate);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(55, 157, 46, 14);
		contentPane.add(lblYears);
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(172, 36, 103, 20);
		contentPane.add(comboBox);
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(172, 72, 103, 20);
		contentPane.add(comboBox_1);
		
		for(Entry<String, String> entry:dataMap.entrySet()){
			comboBox.addItem(entry.getKey().split(",")[0]);
			comboBox_1.addItem(entry.getKey().split(",")[1]);

		}
		textField = new JTextField();
		textField.setBounds(172, 115, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 154, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String initialLoanAmt = textField.getText();
				String period = textField_1.getText();
				String selectedBank = comboBox.getSelectedItem().toString();
				String selectedLoan = comboBox_1.getSelectedItem().toString();
				IBank myBank = new Loan();
				Double paymentAmt = myBank.calculateMountlyPayment(dataMap, selectedBank, selectedLoan, period, initialLoanAmt);
				JOptionPane.showMessageDialog(currentFrame,paymentAmt);
			}
		});
		btnCalculate.setBounds(172, 214, 89, 23);
		contentPane.add(btnCalculate);
		
	}
}
