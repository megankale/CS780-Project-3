@javax.jdo.annotations.PersistenceCapable
public class TimeDate {
	int minute; // MM:HH 
	int hour;
	int day; // MM/DD/YY
	int month;
	int year;
	
	ATMTransaction atmTransaction;
	
	public TimeDate(int min, int hr, int dd, int mm, int yy) { //constructor for TD without ATMTransaction
		this.minute = min;
		this.hour = hr;
		this.day = dd;
		this.month = mm;	
		this.year = yy;
	}
	public TimeDate(int min, int hr, int dd, int mm, int yy, ATMTransaction atmTrans) { //constructor for TD with ATMTransaction
		this.minute = min;
		this.hour = hr;
		this.day = dd;
		this.month = mm;	
		this.year = yy;
		this.atmTransaction= atmTrans;
	}
	
	public void setATMTransaction( ATMTransaction atmTrans) {
		this.atmTransaction= atmTrans;
	}
	
	@Override
	public String toString() {
		return "Time: " + minute +":"+ hour + "	" +
				"Date: " + month + "/" + day + "/" + year + "\n";
		}
	
}
