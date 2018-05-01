@javax.jdo.annotations.PersistenceCapable

public abstract class ATMTransaction implements Comparable<ATMTransaction> {

	String IDcode; // key
	Float amount;  // amount
	Float balance; // remaining balance
	
	TimeDate transactionTD; // MM:HH, MM/DD/YY
	ATM transactionATM; // ATM ID
	BankCard transactionCard; // card ID
	Account transactionAccount; // account ID
	Account targetAccount; // account ID for transfer
	
	
	public ATMTransaction(String code, Float amnt, Float balance) {
		this.amount = amnt;
		this.balance = balance;
		this.IDcode = code;
	}
	
	@Override	
	public int compareTo(ATMTransaction that) { //returns -1 if this ticket has a lower sequence number,0 if same, 1 if higher
		return Utility.compareNums(this.IDcode, that.IDcode);
	}
	
	public void setTD(TimeDate t) {
		this.transactionTD = t;
	}
	
	public void setAccount(Account account) {
		this.transactionAccount = account;
	}
	
	public void setTarget(Account account) {
		this.targetAccount = account;
	}
	
	public void addATM(ATM atm) {
		this.transactionATM= atm;
	}
	
	@Override
	public String toString() {
		String info = "ATMTransaction [" + IDcode + "]" + "\n" + 
						"\t" + transactionTD + "\n" +
						"\t" + transactionAccount + "\n" +
						"\tAmount: " + amount + "\n" +
						"\tBalance: " + balance + "\n";
		return info;
		}
}