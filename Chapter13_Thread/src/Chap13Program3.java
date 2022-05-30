import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap13Program3 extends JFrame {

	public Chap13Program3() {
		this.setTitle("Flickering Label Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// two independent thread !! 
		FlickeringLabel fLabel = new FlickeringLabel("Blink", 500);
		JLabel label = new JLabel("No Blink");
		FlickeringLabel fLabel2 = new FlickeringLabel("Blink Independently", 1000);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300, 170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Chap13Program3();
	}

}
