public class Dice {
	
	// static variables 
	public static int MAX_NUMBER = 6;
	// 보안 상 private, final ( 이중 잠금 ! )
	private static final int MIN_NUMBER = 1;
	private static final int NO_NUMBER = 0;
	
	// data members
	private int number;
	
	public Dice() {
		this.number = NO_NUMBER;
		roll(); // 실제적 초기화 
	}
	
	public void roll() { // setNumber 
		// Random 클래스 사용해도 OK 
		number = (int) ( Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER+1)) + MIN_NUMBER );
		// Math.random()은 0 ~ 1 사이의 난수 반환 -> rescaling 필요 
		// random() * 6 해서 내림 후 int -> 0일 경우 0, 1일 경우 5이 되는 것, 그래서 + 1 ! 
	}
	
	public int getNumber() {
		return this.number;
	}
}
