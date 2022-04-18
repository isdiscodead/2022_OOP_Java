/**
 * Chap9Program1 : Assertion test
 * 
 * @author isdiscodead
 * @version v0.1
 * @since 04-18-2022
 * 
 */
public class Chap9Program1 {
	
	/**
	 * Balance of the Bank Account 
	 */
	static double balance = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		deposit(20);
		System.out.println("Balance: " + balance );
		
		withdraw(20);
		System.out.println("Balance: " + balance );
	}
	
	/**
	 * Function to deposit in given account ( add )
	 * @param amount
	 * @return balance 
	 */
	private static double deposit(double amount) {
		double oldBalance = balance; 
		balance += amount;
		// assert -> 디버깅 모드에서만 컴파일되는 부분, 하나의 checking point 
		assert balance > oldBalance :
			"Serious Error - balance did not increased after deposit";
		
		return balance;
	}
	
	/**
	 * Function to withdraw in given account ( sub )
	 * @param amount
	 * @return balance 
	 */
	private static double withdraw(double amount) {
		double oldBalance = balance; 
		balance -= amount;
		assert balance > oldBalance :
			"Serious Error - balance did not decreased after withdraw";
		
		return balance;
	}

}
