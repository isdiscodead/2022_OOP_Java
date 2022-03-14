import javax.swing.*;
// javax.swing 의 모든 것 import

public class Ch2Sample1 { // Ch2Sample1 클래스
	
	public static void main(String[] args) { // main -> 시작 위치 !

		// class name에 커서 올려두고 ctrl + click 눌러서 declaration 볼 수 있음
		JFrame myWindow; // JFrame 인스턴스를 1개 가질 것이라 이름 선언
		myWindow = new JFrame(); // 인스턴스화된 객체 생성
		
		// 위의 코드는 JFrame myWindow = new JFrame(); 과 동일함
		
		// 객체 사용 -> declaration으로 매개변수 확인 가능
		myWindow.setSize(300, 200); // width, height px
		myWindow.setTitle("My First Java Program");	
		myWindow.setVisible(true);
		
	}
}
