import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;

/** chap12Program2 :  */

public class Chap12Program2 extends JFrame { // JFrame -> abstract X 
	/**
	 * constructor 
	 */
	public Chap12Program2() {
		
		this.setTitle("Chap12Program2 Example!");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 종료 
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		contentPane.setLayout(new GridLayout(4,2,5,5)); // row, col, hgap, vgap
		
		// add components
		contentPane.add(new Label(" Name"));
		contentPane.add(new TextField(""));
		
		contentPane.add(new Label(" ID"));
		contentPane.add(new TextField(""));
		
		contentPane.add(new Label(" Department"));
		contentPane.add(new TextField(""));
		
		contentPane.add(new Label(" Grade"));
		contentPane.add(new TextField(""));
		
		this.setVisible(true);
		
		
	}
	
	/**
	 * main function
	 * @param args No args.
	 */

	public static void main(String[] args) {
		Chap12Program2 frame = new Chap12Program2();

	}

}
