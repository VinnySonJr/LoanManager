package logic;

import java.util.TreeMap;

public interface IBank {
	public void nameBank(String bankname);
	public Double calculateMountlyPayment(TreeMap<String,String> dataMap, String Bank, String Loan, String period, String initialLoanAmt);
}
