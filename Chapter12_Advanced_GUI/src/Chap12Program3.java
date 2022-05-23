import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Chap12Program3 extends JFrame {
	
	public Chap12Program3() {
		setTitle("Event example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Step 1. set Layout 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// Step 2. Add Component 
		JButton leftBtn = new JButton("Left");
		this.add(leftBtn);
		JButton rightBtn = new JButton("Right");
		this.add(rightBtn);
		
		// Step 3. Add event handler 
		leftBtn.addActionListener(new ButtonActionListener());
		rightBtn.addActionListener(new ButtonActionListener());
		
		// Step 4. Frame option
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chap12Program3();
	}
}

