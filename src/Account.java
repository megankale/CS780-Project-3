import java.util.TreeSet;
import java.util.HashSet;

@javax.jdo.annotations.PersistenceCapable

public class Account implements Comparable<Account>{
	String number; // account number
	Float currentBalance; // current balance
	
	// set of account holders for this account, minimum one required
	HashSet<AccountHolder> accountHolders;
	
	//set of transfers for this account
	TreeSet<Transfer> accountTransfers;
	
	//set of ATMTransactions
	TreeSet<ATMTransaction> accountATMTrans;
	
	public Account(String number, Float currentBalance) {
		this.number = number;
		this.currentBalance = currentBalance;
		accountHolders = new HashSet<>();
		accountTransfers = new TreeSet<>();
		accountATMTrans = new TreeSet<>();
	}
	
	public void addAccountHolder (AccountHolder aH) {
		accountHolders.add(aH);
	}
	
	public void addTransfer (Transfer transfer) {
		accountTransfers.add(transfer);
	}
	
	public void addATM (ATMTransaction atmTrans) {
		accountATMTrans.add(atmTrans);
	}
	
	//compares this account with another based on the number and current balance
	
	@Override
	public int compareTo(Account that) { //returns 0 if accounts are same, -1 or 1 if different
		int numCompare = Utility.compareNums(this.number, that.number);
		if (numCompare == 0) { //number is the same
			return Utility.compareCurrBalance(this.currentBalance, that.currentBalance);
		}
		return numCompare;
	}
	@Override
	public String toString() {
		return "Account: " + number + " balance is " + currentBalance;
		}
}

