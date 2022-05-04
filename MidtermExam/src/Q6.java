
/**
 * 2022 OOP Midterm Exam Q6
 * Program that compiles some notations
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q6 {

	public static void main(String[] args) {
		String notation = ""; // 1 + 2 + 3 / 3 * 4 - 2
		for ( int i=0 ; i<args.length ; i++ ) {
			notation += args[i];
			if ( i != args.length-1 ) {
				notation += " ";
			}
		}
		System.out.println("Entered formula: " + notation);
		
		double result = 0;
		for ( int i=0 ; i < notation.length() ; i++ ) {
			if ( " ".equals(notation.substring(i, i+1)) ) {
				double num1 = Double.parseDouble(notation.substring(i-1, i) );
				String oper = notation.substring(i+1, i+2);
				double num2 = Double.parseDouble(notation.substring(i+2, i+3) );
				
				double subResult = 0;
				
				if ( result != 0 ) {
					num1 = result;
				}
				
				if ( oper.equals("+") ) {
					subResult = num1 + num2;
				} else if ( oper.equals("-") ) {
					subResult = num1 - num2;
				} else if ( oper.equals("*") ) {
					subResult = num1 * num2;
				} else {
					subResult = num1 / num2;
				}
				
				result += subResult;
				
			}
		}
		
		System.out.println("The result of the entered formula: " + result );
		
	}

}
