package testPackage;

public class Chap8Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1, bike2;
		
		bike1 = new Bicycle("Jiwon Lee");
		bike2 = new Bicycle("Ggong chi");
		
		System.out.println(bike1.getOwnerName() + "owns a bicycle.");
		System.out.println(bike2.getOwnerName() + "also owns a bicycle.");
	}

}
