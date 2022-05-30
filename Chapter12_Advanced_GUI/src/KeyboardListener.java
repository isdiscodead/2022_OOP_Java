import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class KeyboardListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		JLabel la = Chap12Program6.la;
		int FLYING_UNIT = Chap12Program6.FLYING_UNIT;
		
		switch (keyCode) {
		
		case KeyEvent.VK_UP:
			la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
			break;
			
		case KeyEvent.VK_DOWN:
			la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
			break;
			
		case KeyEvent.VK_LEFT:
			la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
			break;
			
		case KeyEvent.VK_RIGHT:
			la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
			break;
		}
	}
}
