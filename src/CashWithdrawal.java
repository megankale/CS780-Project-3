@javax.jdo.annotations.PersistenceCapable

public class CashWithdrawal extends ATMTransaction{

//	public CashWithdrawal(ATM atm, BankCard card, Account account, TimeDate td, Float amnt, Float blnce) {
//		super(atm, card, account, td, amnt, blnce);
//		
//		this.transactionTD = td;
//		this.transactionATM = atm;
//		this.transactionCard = card;
//		this.transactionAccount = account;
//		this.amount = amnt;
//		this.balance = blnce;
//	}
	
	public CashWithdrawal(String code, Float amnt, Float balance) {
		super(code, amnt, balance);
		this.amount = amnt;
		this.balance = balance;
		this.IDcode = code;
	}
	
	@Override
	public String toString() {
		String info = "Cash Withdrawal " + "\n" + 
						"\t" + transactionTD + "\n" +
						"\t" + transactionAccount + "\n" +
						"\tAmount: " + amount + "\n" +
						"\tBalance: " + balance + "\n";
		return info;
		}

}