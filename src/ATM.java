import java.util.TreeSet;
@javax.jdo.annotations.PersistenceCapable

public class ATM {
	
	String IDcode;
	
	TreeSet<ATMTransaction> transactionsOfATM; //set of transactions that use this ATM
	
	public ATM(String id) {
		this.IDcode= id;
		transactionsOfATM = new TreeSet<>();
	}
	
	public void addATMTransaction(ATMTransaction atmTrans) {
		transactionsOfATM.add(atmTrans);
	}
	@Override
	public String toString() {
		return IDcode;
	}
}
