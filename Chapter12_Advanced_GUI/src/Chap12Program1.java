import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/** chap12Program1 : 300 x 300 Swing Frame */

public class Chap12Program1 extends JFrame { // JFrame -> abstract X 
	/**
	 * constructor 
	 */
	public Chap12Program1() {
		// this 사용 이유 -> 없어도 상관 없지만 여러 window instance 사용 시 필요함 !! 
		this.setTitle("Welcome to GUI environment!");
		this.setSize(300, 300);
		
		// Container -> defualt layout = BorderLayout
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK);
		// contentPane.setLayout(new BorderLayout());
		
		// add components
		// BorderLayout -> NORTH, EAST, SOUTH, WEST, CENTER 존재 
		contentPane.add(new JButton("test1"), BorderLayout.NORTH);
		contentPane.add(new JButton("test2"));
		
		this.setVisible(true);
		
		
	}
	
	/**
	 * main function
	 * @param args No args.
	 */

	public static void main(String[] args) {
		Chap12Program1 frame = new Chap12Program1();

	}

}
