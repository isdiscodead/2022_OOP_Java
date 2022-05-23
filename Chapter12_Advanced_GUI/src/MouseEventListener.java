import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventListener implements MouseListener {
	@Override
	public void mousePressed(MouseEvent e) {
		// get mouse positions 
		int x = e.getX();
		int y = e.getY();
		
		// e.getSource() -> Event Listener가 add된 객체 가져옴 
		JFrame frmae = (JFrame)e.getSource();
	
		// 다른 클래스에서 접근하여 변경할 수 없음 ... 
		// simpleLabel.setLocation(x, y);
	}

	@Override
	public void mouseClicked(MouseEvent e) {		
	}

	@Override
	public void mouseReleased(MouseEvent e) {	
	}

	@Override
	public void mouseEntered(MouseEvent e) {	
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
