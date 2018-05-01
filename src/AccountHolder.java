import java.util.TreeSet;

@javax.jdo.annotations.PersistenceCapable

public class AccountHolder {
	String name;
	String address;
	String SSN;
	
	TreeSet<Account> accountsOfHolder;
	TreeSet<BankCard> cardsOfHolder;
	
	public AccountHolder(String name, String address, String SSN) {
		this.name = name;
		this.address = address;
		this.SSN = SSN;
		
		accountsOfHolder = new TreeSet<>();
		cardsOfHolder = new TreeSet<>();
	}
	
	public void addBankCard(BankCard card) {
		cardsOfHolder.add(card);
	}
	
	public void addAccount(Account account) {
		accountsOfHolder.add(account);
	}
	
	@Override
	public String toString() {
		return "" + name + ", " + address + "\n";
	}
}
	