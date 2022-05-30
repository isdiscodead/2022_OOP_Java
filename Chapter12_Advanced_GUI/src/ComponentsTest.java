import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ComponentsTest extends JFrame {
	
	// 접근 문제 해결을 위해 클래스 멤버 변수로 선언 
	JLabel comboLabel = new JLabel("hi");
	JButton comboBtn = new JButton("Show");
	String languages[] = { "C", "C++", "Python", "Java", "C#" };
	
	// final로 하는 이유 -> 컴포넌트 객체 변형을 막기 위함 ( 안 써도 보통 문제 X )
	final JComboBox cb = new JComboBox(languages); 
	
	public ComponentsTest() {
		setTitle("Example of Components");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		
		
		// add password field & label
		JLabel l1 = new JLabel("password: ");
		JPasswordField pwd = new JPasswordField();
		
		// setBounds -> 크기 및 위치 설정
		l1.setBounds(20, 100, 80, 30); // x, y, width, height
		pwd.setBounds(100, 100, 200, 30);
		
		// check box ( 여러 개 선택 ) ~~ radio box ( 1개 선택 )
		JCheckBox checkBox1 = new JCheckBox("C++");
		checkBox1.setBounds(100, 50, 100, 80);
		JCheckBox checkBox2 = new JCheckBox("Java", true); // 기본 값으로 checked = true 
		checkBox2.setBounds(200, 50, 100, 80);
		
		// combo box 
		cb.setBounds(150, 150, 140, 20);
		comboLabel.setBounds(200, 200, 90, 20);
		comboBtn.setBounds(300, 150, 50, 20);
		comboBtn.addActionListener(new ButtonEvent());
		
		this.add(l1);
		this.add(pwd);
		this.add(checkBox1);
		this.add(checkBox2);
		this.add(cb);
		this.add(comboBtn);
		this.add(comboLabel);
		
		this.setSize(500, 400);
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		ComponentsTest test = new ComponentsTest();
	}
	
	
	public class ButtonEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = (String) cb.getItemAt(cb.getSelectedIndex()); // 선택한 내용 가져오기 
			comboLabel.setText(str);
		}
		
	}

}
