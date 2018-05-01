import java.util.HashSet;
@javax.jdo.annotations.PersistenceCapable

public class Branch{
	String IDcode;
	String name;
	String address;
	
	HashSet<ATM> branchATMs;
	
	public Branch(String id, String name, String address) {
		this.IDcode = id;
		this.name = name;
		this.address =  address;
		this.branchATMs = new HashSet<>();
	}
	public void addATM(ATM atm) {
		this.branchATMs.add(atm);
	}
	
	@Override
	public String toString() {
		if (branchATMs.isEmpty()) {
			return "Branch: " + name + "," + address;
		}
		else {
			String info = "Branch: " + name + "," + address + "\n";
			info += "\tBranch ATMs;\n";
			Object[] atms = branchATMs.toArray();
			for (int i = 0; i < atms.length; i++) {
				info += "\t" + (i+1) + "/" + atms.length;
				info += "\t" + atms[i];
				if ( i < atms.length -1) info += "\n";
			}
			return info;
		}
	}
}
