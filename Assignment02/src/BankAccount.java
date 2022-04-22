/**
 * 
 * Q4. Bank Account Class Implication
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-21
 *
 */

public class BankAccount {
	/**
	 * data memeber for owner's name ( String )
	 */
	private String ownerName;
	
	/**
	 * data member for amount of money in an account ( double )
	 */
	private double balance;
	
	
	/**
	 * Assigns the name of this account's owner
	 * @param name : set the owner's name into data member
	 */
	public void setOwnerName(String name) {
		this.ownerName = name;
	}
	
	/**
	 * Returns the name of this bicycle's owner
	 * @return ownerName;
	 */
	public String getOwnerName() {
		return this.ownerName; 
	}
	
	/**
	 * Assigns the amount of this account's initial balance
	 * @param balance : set the account's initial balance into data member
	 */
	public void setInitialBalance(double initialBalance) {
		this.balance = initialBalance;
	}
	
	/**
	 * Returns the amount of this account's current balance
	 * @return balance;
	 */ 
	public double getBalance() {
		return this.balance; 
	}
	
	/**
	 * increase the amount of this account's balance
	 * @param amount : amount of increasement
	 */
	public void addBalance(double amount) {
		this.balance += amount;
	}
	
	/**
	 * decrease the amount of this account's balance
	 * @param amount : amount of decreasement
	 */
	public void deductBalance(double amount) {
		this.balance -= amount;
	}
	
}
