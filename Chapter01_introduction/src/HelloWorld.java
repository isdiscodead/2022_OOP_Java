import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// Class unit -> 첫 글자가 대문자 ( Carmel case )
		// Function unit -> 첫 글자가 소문자 ( Snake case )
		System.out.println("Hello World!");
		
		// sysout + ctrl + space 로 println() 호출 가능 
		System.out.println("맥북... 저주해");
		
		// ctrl + / 눌러서 해당 줄 자동 주석 및 해제 가능 !  
		// ( 여러 줄은 shift 추가 및 해제 시 역 슬래쉬 \  사용 )
		// ctrl + i로 코드 들여쓰기 정렬 가능 
		
		// GUI 맛보기
		String firstName = JOptionPane.showInputDialog(null, "Please Enter the your first name.");
		String lastName = JOptionPane.showInputDialog(null, "Please Enter the your last name.");
	
		JOptionPane.showMessageDialog(null, "Hello World! " + firstName + " " + lastName);
		
	}
}
