import javax.swing.JFrame;

/** chap12Program1 : 300 x 300 Swing Frame */

public class Chap12Program1 extends JFrame {
	/**
	 * constructor 
	 */
	public Chap12Program1() {
		// this 사용 이유 -> 없어도 상관 없지만 여러 window instance 사용 시 필요함 !! 
		this.setTitle("Welcome to GUI environment!");
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	/**
	 * main function
	 * @param args No args.
	 */

	public static void main(String[] args) {
		Chap12Program1 frame = new Chap12Program1();

	}

}
