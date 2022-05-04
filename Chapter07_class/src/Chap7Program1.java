/*
 * 20220406
 * Usage of multiple classes
 * Jiwon Lee
 * 
 * */

public class Chap7Program1 { 
	
	public static void main(String args[]) {
		
		Bicycle bike1, bike2;
		String owner1, owner2;
		
		bike1 = new Bicycle();
		bike1.setOwnerName("지원");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("성묵");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		System.out.println(owner1 + "owns a bicycle.");
		System.out.println(owner2 + "also owns a bicycle.");
	}
}	
