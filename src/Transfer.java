@javax.jdo.annotations.PersistenceCapable

public class Transfer  extends ATMTransaction{
	Float targetBalance;

	public Transfer(String code, Float amnt, Float balance, Float target) {
		super(code, amnt, balance);
		this.amount = amnt;
		this.balance = balance;
		this.IDcode = code;
		this.targetBalance = target;
	}
	
	@Override
	public String toString() {
		String info = "Transfer from " + transactionAccount + "to  " + targetAccount + "\n" + 
						"\t" + transactionTD + "\n" +
						"\t" + transactionAccount + "\n" +
						"\tAmount: " + amount + "\n" +
						"\tBalance: " + balance + "\n";
		return info;
		}

}