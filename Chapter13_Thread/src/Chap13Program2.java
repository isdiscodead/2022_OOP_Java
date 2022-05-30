import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap13Program2 extends JFrame {

	public Chap13Program2() {
		this.setTitle("Timer Example");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel); 
		Thread th = new Thread(runnable); // runnable 객체를 thread에 전달 
		
		setSize(300, 170);
		setVisible(true);
		 
		th.start(); // thread 사용 -> 창 뒤집어도 background에서 work ... 
	}
	
	public static void main(String[] args) {
		new Chap13Program2();
	}

}
