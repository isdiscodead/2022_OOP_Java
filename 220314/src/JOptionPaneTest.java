import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = JOptionPane.showInputDialog(null, "Please Enter the your first name.");
		String lastName = JOptionPane.showInputDialog(null, "Please Enter the your last name.");
	
		JOptionPane.showMessageDialog(null, "Hello World! " + firstName + " " + lastName);
	}

}
