import javax.swing.*;

public class Chap2Program3 {

	public static void main(String[] args) {
		// 선언은 모두 Type name;
		int a;
		a = 10;
		
		// 변수 생성 -> Value만 있으면 OK 
		String name = "Jiwon Lee";
		// = new String("Jiwon Lee")도 가능은 함, String도 클래스니깐 ~
		
		// 인스턴스 생성 -> new Class(); 필요 !!
		JFrame exampleWindow = new JFrame();
		exampleWindow.setSize(3000,2000);
		exampleWindow.setTitle(name);
		exampleWindow.setVisible(true);
	}
}
