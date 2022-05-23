import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap12Program6 extends JFrame {
	
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");

	public Chap12Program6() {
		setTitle("Example of Key event");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyboardListenerInClass() );
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component) e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Chap12Program6();

	}
	
	
	public class KeyboardListenerInClass extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			
			case KeyEvent.VK_UP:
				// position의 경우 왼쪽 위가 0, 0임 
				// 그러므로 위로 올리려면 -로 연산 
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
				
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
				
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
				
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			}
		}
	}

}
