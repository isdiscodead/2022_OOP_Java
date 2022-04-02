
/*
 * 2022-03-29
 * Implementing a converter ( Korean won into dollar ) / 1225.45 per $1.
 * Implemented by Jiwon Lee 
 * 
 */

import java.util.*;
import javax.swing.JOptionPane;

public class Ex02KoreanToDollar {

	public static void main(String[] args) {
		Double dollar, won;
		String output;
		Formatter formatter = new Formatter();
		
		// Input 
		won = Double.parseDouble( JOptionPane.showInputDialog(null, "Please input your Korean money.") );
		
		// Calculation
		dollar = won / 1225.45;

		// Output
		JOptionPane.showMessageDialog(null, won + " won is " + formatter.format("%.2f", dollar) + "$.");
			
	}

}
