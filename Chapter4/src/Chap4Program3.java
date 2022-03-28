import javax.swing.JOptionPane;

/*
 * 2022/03/28
 * Repetition Statement Sample & Self Check
 * Implemented by Jiwon Lee
 * */

public class Chap4Program3 {

	public static void main(String[] args) {
		for ( int i=0; i < 10 ; i++ ) {
			System.out.println(i+1); // 1~10 순서대로 출력 반복 
		}
		
		while ( true ) { // 1 != true
			System.out.println("Hello World!");
			break;
		}
		
		// Exception Handling I 
		String inputStr; int age;
		
		inputStr = JOptionPane.showInputDialog(null, "Your Age (0~130): ");
		age = Integer.parseInt(inputStr); // 원래 여기서도 exception handling 들어가야 함 ( error type 이용 )
		
		while ( age<0 || age>130 ) {
			JOptionPane.showMessageDialog(null, "An Invalid age was entered. Please try again");
			inputStr = JOptionPane.showInputDialog(null, "Your Age (0~130): ");
			age = Integer.parseInt(inputStr);
		}
		
		System.out.println(age);
		
		
		// Exception Handling II 
		String name;
		
		while ( true ) {
			name = JOptionPane.showInputDialog(null, "Your name");
			if ( name.length() > 0 ) {
				break;
			}
			JOptionPane.showMessageDialog(null, "An Invalid name was entered. Please try again");
		}
		
		System.out.println(name);
		
		// JOptionPane : Confirmation Dialog
		// 선택된 옵션은 미리 클래스에서 지정된 int로 반환됨 
		int selection = JOptionPane.showConfirmDialog(null, 
				/* prompt */  "Play Another Game?", 
				/* title */   "Confirmation",
				/* options */ JOptionPane.YES_NO_OPTION);
		boolean keepPlaying = (selection == JOptionPane.YES_OPTION);
		System.out.println(keepPlaying);
	}

}
