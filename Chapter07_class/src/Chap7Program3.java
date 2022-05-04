
public class Chap7Program3 {

	public static void main(String[] args) {
		Dice diceOne = new Dice(), diceTwo = new Dice(); 
		System.out.println("one: " + diceOne.getNumber());
		System.out.println("two: " +diceTwo.getNumber());
		
		diceOne.roll();
		System.out.println("one: " + diceOne.getNumber());
		System.out.println("two: " + diceTwo.getNumber());

		diceTwo.roll();
		System.out.println("one: " + diceOne.getNumber());
		System.out.println("two: " + diceTwo.getNumber());
	}

}
