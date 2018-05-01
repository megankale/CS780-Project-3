import javax.jdo.PersistenceManager;
import com.objectdb.Utilities;

public class CreateData {
	public static void main(String[] args) {
		
		CashDeposit cashDeposit = new CashDeposit("CD898760abc65", (float)1000.00, (float)4000.00);
		CashWithdrawal cashWithdrawal = new CashWithdrawal("CW10000xyz897", (float)2000.00, (float)2000.00);
		Transfer transfer = new Transfer("T54378765sss765", (float)1000.00, (float)4000.00, (float)7000.00);
		
		TimeDate t1 = new TimeDate(15, 9, 01, 03, 2018);
		TimeDate t2 = new TimeDate(30, 10, 15, 03, 2018);
		TimeDate t3 = new TimeDate(45, 15, 01, 04, 2018);
		TimeDate t4 = new TimeDate(59, 23, 01, 10, 2020);
		
		cashDeposit.setTD(t1);
		cashWithdrawal.setTD(t2);
		transfer.setTD(t3);
		
		Account a1 = new Account("87654008", (float)1000.00);
		Account a2 = new Account("14358055", (float)7000.00);
		
		cashDeposit.setAccount(a1);
		cashWithdrawal.setAccount(a1);
		transfer.setAccount(a1);
		transfer.setTarget(a2);
		
		ATM atm = new ATM("20001111");
		
		cashDeposit.addATM(atm);
		cashWithdrawal.addATM(atm);
		transfer.addATM(atm);
		
		Branch branch = new Branch("20022", "Hillside", "200 Hillside St., Flushing, NY");
		branch.addATM(atm);
		
		BankCard card = new BankCard("8765098724357651", "745", "60094");
		card.setTD(t4);
		card.addTransaction(cashWithdrawal);
		card.addTransaction(cashDeposit);
		card.addTransaction(transfer);
		
		AccountHolder aH = new AccountHolder("Jane Smith", "100 Main St.", "123456789");
		a1.addAccountHolder(aH);
		a2.addAccountHolder(aH);
		
		//Commit to JDO
        PersistenceManager pm = Utilities.getPersistenceManager("bank.odb");
        pm.currentTransaction().begin();
        pm.makePersistent(cashDeposit);
        pm.makePersistent(cashWithdrawal);
        pm.makePersistent(transfer);
        pm.makePersistent(branch);
        pm.makePersistent(card);
        pm.makePersistent(t1);
        pm.makePersistent(t2);
        pm.makePersistent(t3);
        pm.makePersistent(t4);
        pm.makePersistent(a1);
        pm.makePersistent(aH);
        pm.makePersistent(atm);    
        pm.currentTransaction().commit();
        System.out.println("DONE");

	}
}
