import javax.swing.JOptionPane;

/**
 * 
 * Q3. Ideal Weight
 * calculates a person’s ideal weight.
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-21
 *
 */

public class Q3 {

	public static void main(String[] args) {
		
		String[] genderOptions = {"Female", "Male"};
		int height=0, gender;
		double idealWeight;
		String input = null;
		
		
		// input gender 
		gender = JOptionPane.showOptionDialog(null, "What is your gender", 
				"Calculate ideal weight", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				genderOptions, null);

		// input height 
		while ( height == 0 ) {
			try {
				input = JOptionPane.showInputDialog(null, "How tall are you? (cm)");
				if ( input == null ) { // 취소 버튼 눌렀을 경우 
					return;
				}
				height = Integer.parseInt(input);
				
			} catch ( NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter integer digits only");
			}

		}
				
		
		// computation 
		if ( gender == JOptionPane.YES_OPTION ) { // 오른쪽 옵션, Female
			if ( height > 150 ) {
				idealWeight = ( 37.8 + 0.75 * (height - 150) );
			} else {
				idealWeight = 37.8;
			}
			 
		} else { // Male의 경우 
			if ( height > 150 ) {
				idealWeight = ( 40 + 0.89 * (height - 150) );
			} else {
				idealWeight = 40;
			}
		}
		
		// output 
		JOptionPane.showInternalMessageDialog(null, ("Your ideal weight is " + idealWeight + "kg"));
	
	}

}
