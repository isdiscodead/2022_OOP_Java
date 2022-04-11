
public class Account {
	private double balance;
	private String ownerName;
	
	// constructor -> object를 매개변수로 받을 수도 있음 !! 똑같이 .으로 접근 
	public Account() {
		ownerName = "";
		balance = 0;
	}
	
	// setter
	public void setInitialBalance(double balance) {
		this.balance = balance;
	}
	public void setOwerName(String owrnerName) {
		this.ownerName = owrnerName;
	}
	
	// getter
	public double getCurrentBalance() {
		return this.balance;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	
	// custom function : add
	public void add(double amount) {
		this.balance += amount;
	}
	
	// custom function : deduct
	public void deduct(double amount) {
		this.balance -= amount;
	}
}
