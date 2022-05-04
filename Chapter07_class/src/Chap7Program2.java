
public class Chap7Program2 {
	public static void main(String[] args) {
		
		Bicycle bike;
		Account acctJiwon;
		
		String myName = "Jiwon Lee";
		
		bike = new Bicycle();
		bike.setOwnerName(myName);
		
		acctJiwon = new Account();
		acctJiwon.setOwerName(myName);
		acctJiwon.setInitialBalance(250.00);
		
		acctJiwon.add(25.00);
		acctJiwon.deduct(50); // 출금 
		
		System.out.println(bike.getOwnerName() + "owns a bicycle and ");
		System.out.println("has $" + acctJiwon.getCurrentBalance() + " left in the bank.");
		
	}
}
