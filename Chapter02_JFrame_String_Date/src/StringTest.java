public class StringTest {

	public static void main(String[] args) {
		// Standard Class들은 클래스.함수 사용도 가능 ! 
		// ex) JOptionPane.showMessageDialog(null, "Hello World! " + firstName + " " + lastName);
				
		// String 인스턴스 생성 
		// String name = new String("Jiwon Lee");
		String name = "Jiwon Lee";
		
		// 아래 방식도 가능하지만 function 사용 불가 !!
		char[] arr = {'J', 'i', 'w', 'o', 'n'};
		
		// substring(시작,끝) substring(끝)  문자열 자르기
		System.out.println(name.substring(1, 3));
		
		// 문자열 길이
		System.out.println(name.length());
		
		// indexOf(char) indexOf(string) indexOf(int): index 찾기 ( 시작 위치 )
		System.out.println(name.indexOf("Lee"));
		
		// + 연산자 : 문자열 더하기 ( concat )
		// OOP의 특징 중 하나인 다형성으로 인해 int와 다른 연산 진행됨 
		name = "Ggong" + " " + "Chi";
		System.out.println(name);
	}

}
