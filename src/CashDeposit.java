@javax.jdo.annotations.PersistenceCapable

public class CashDeposit extends ATMTransaction{
	
	public CashDeposit(String code, Float amnt, Float balance) {
		super(code, amnt, balance);
		this.amount = amnt;
		this.balance = balance;
		this.IDcode = code;
	}
	
	@Override
	public String toString() {
		String info = "Cash Deposit " + "\n" + 
						"\t" + transactionTD + "\n" +
						"\t" + transactionAccount + "\n" +
						"\tAmount: " + amount + "\n" +
						"\tBalance: " + balance + "\n";
		return info;
		}

}
