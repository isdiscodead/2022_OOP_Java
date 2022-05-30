import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap13Program1 extends JFrame {

	public Chap13Program1() {
		this.setTitle("Timer Example");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel); 
		
		setSize(300, 170);
		setVisible(true);
		 
		th.start(); // thread 사용 -> 창 뒤집어도 background에서 work ... 
	}
	
	public static void main(String[] args) {
		new Chap13Program1();
	}

}
