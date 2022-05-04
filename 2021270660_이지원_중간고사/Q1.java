import javax.swing.JOptionPane;

/**
 * 2022 OOP Midterm Exam Q1
 * Program that input name and number and output sum of number
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q1 {

	public static void main(String[] args) {
		// input 
		String input = JOptionPane.showInputDialog("Enter your name & student ID (i.e. Minseok Seo / 12345678: ");
		
		// seperate
		int idx = input.indexOf('/');
		String name = input.substring(0, idx);
		String number = input.substring(idx+1, input.length());
		
		// calculate
		int sum = 0;
		for ( int i=1 ; i<number.length() ; i++ ) {
			if ( number.substring(i-1, i).equals(" ")) {
				continue;
			}
			sum += Integer.parseInt(number.substring(i-1, i));
		}
			
		
		// output
		System.out.println("Hello OOP World! " + name);
		System.out.println("The sum of each number of your student number entered is " + sum);
	}

}
