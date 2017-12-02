package logic;

import java.util.TreeMap;

public class Loan implements IBank{
	public Double calculateMountlyPayment(TreeMap<String,String> dataMap,
			String Bank, String Loan, String period, String initialLoanAmt){
		Double rate = .01*Double.valueOf(dataMap.get(Bank+","+Loan));
		Double payment = (double) Math.round((rate*Math.pow((1+rate),Integer.parseInt(period)))
				/(Math.pow((1+rate),Integer.parseInt(period))-1)*
				Double.valueOf(initialLoanAmt));
		
		return payment;
	}
	public void nameBank(String bankname){
		//
	}
}
