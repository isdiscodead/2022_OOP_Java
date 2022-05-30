import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap12Program6 extends JFrame {
	
	// public static은 nested class 사용 X지만 보안이 낮아 사용 X
	// 변경될 일이 없고, 변경되어도 괜찮은 경우에만 사용 ... 
	public static final int FLYING_UNIT = 10;
	public static JLabel la = new JLabel("HELLO");

	public Chap12Program6() {
		setTitle("Example of Key event");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyboardListener() );
		
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
	

}
