import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Chap12Program4 extends JFrame {
	
	JLabel simpleLabel = new JLabel("Hello");
	
	public Chap12Program4() {
		// Frame Option 
		setTitle("Example of Mouse Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		c.add(simpleLabel);
		
		// c.addMouseListener( new MouseEventListener() );
		c.addMouseListener( new MouseEventAdapterInClass() );
		
		simpleLabel.setSize(50, 20);
		simpleLabel.setLocation(30, 30);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MouseEventAdapterInClass extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			// get mouse positions 
			int x = e.getX();
			int y = e.getY();
			
			// e.getSource() -> Event Listener가 add된 객체 가져옴 
			// JFrame frame = (JFrame)e.getSource();
		
			// 다른 클래스에서 접근하여 Label 변경할 수 없음 ... 
			// 중첩 class에서만 접근 가능 
			simpleLabel.setLocation(x, y);
			
			// 1. public static 사용 -> 보안 낮음 
			// 2. 중첩 class 사용 -> MVC 패턴은 X 
		}
	}

	public static void main(String[] args) {
		new Chap12Program4();
	}

}


