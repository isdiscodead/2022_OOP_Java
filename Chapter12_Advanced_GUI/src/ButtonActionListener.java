import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class ButtonActionListener implements ActionListener {
	
	@Override
	// ActionListener Interface에서 반드시 구현해야 하는 method
	public void actionPerformed(ActionEvent e) { 
		JButton b  = (JButton) e.getSource();
		
		if ( b.getText().equals("Left")) {
			System.out.println("Left Click!!");
			
		} else if ( b.getText().equals("Right")) {
			System.out.println("Right Click!!");
			
		} else {
			b.setText("Action");
		}
		
	}
}