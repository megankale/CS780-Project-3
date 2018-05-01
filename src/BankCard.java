import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable

public class BankCard {
	String number;
	String securityCode;
	String PIN;
	
	TimeDate bankCardTD;
	AccountHolder bankCardHolder;
	TreeSet<ATMTransaction> transactionsOfCard;
	
	public BankCard( TimeDate td, AccountHolder holder, String num, String code, String pin) {
		this.bankCardTD= td;
		this.bankCardHolder = holder;
		this.number = num;
		this.PIN = pin;
		this.securityCode = code;
		
		transactionsOfCard = new TreeSet<>();
	}
	
	public BankCard(String num, String code, String pin) {
//		this.bankCardTD= td;
//		this.bankCardHolder = holder;
		this.number = num;
		this.PIN = pin;
		this.securityCode = code;
		
		transactionsOfCard = new TreeSet<>();
	}
	
	public void setTD(TimeDate t) {
		this.bankCardTD = t;
	}
	
	public void setAccountHolder(String name, String address, String SSN) {
		this.bankCardHolder = new AccountHolder(name,address,SSN);
	}

	public void addTransaction(ATMTransaction trans) {
		this.transactionsOfCard.add(trans);
	}
	public String toString() {
		return "Bank Card " + number;
	}
}
