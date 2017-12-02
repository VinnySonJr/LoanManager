package logic;

import java.util.TreeMap;

public class Bank{
	private IBank bank= new Loan();
	public Double calculateMountlyPayment(TreeMap<String,String> dataMap, String SelectedBank, String SelectedLoan, String period, String initialLoanAmt){
		return this.bank.calculateMountlyPayment(dataMap,SelectedBank,SelectedLoan,period,initialLoanAmt);
	}
}
