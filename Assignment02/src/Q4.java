/**
 * 
 * Q4. Bank Account Class using example 
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-21
 *
 */

public class Q4 {
	
	public static int MAX_ACCOUNT_NUMBER = 1000;
	public static int MAX_INIT_BALANCE = 50000;

	public static void main(String[] args) {
		
		// create a total of 1000 banking account
		BankAccount[] accounts = new BankAccount[MAX_ACCOUNT_NUMBER];
		String name;
		Double initBalance;
		
		for ( int i=0 ; i < accounts.length ; i++ ) {
			accounts[i] = new BankAccount();
			name = "owner_" + i;
			initBalance = (double)(Math.floor(Math.random() * MAX_INIT_BALANCE));
			accounts[i].setOwnerName(name);
			accounts[i].setInitialBalance(initBalance);
		}
		
		// add $10000 to everyone's account
		for ( int i=0 ; i < accounts.length ; i++ ) {
			accounts[i].addBalance(10000);
		}
		
		// calculate : max balance account
		int maxIndex = 0;
		for ( int i=1 ; i < accounts.length ; i++ ) {
			if ( accounts[maxIndex].getBalance() < accounts[i].getBalance() ) {
				maxIndex = i;
			}
		}
		
		// output : max balance account
		System.out.println("name: " + accounts[maxIndex].getOwnerName() 
				+ "\t" + accounts[maxIndex].getBalance() + "$");
	}

}
