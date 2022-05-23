import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		switch (keyCode) {
		
		case KeyEvent.VK_UP:
			// la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
			break;
			
		case KeyEvent.VK_DOWN:
			break;
			
		case KeyEvent.VK_LEFT:
			break;
			
		case KeyEvent.VK_RIGHT:
			break;
		}
	}
}
