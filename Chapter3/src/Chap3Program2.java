import javax.swing.JOptionPane;

/* 
 * Chap3Program3 Sample Program : Find Area and Circumference
 * 2022/03/23
 * Jiwon Lee 
 * 
 */

public class Chap3Program2 {
	
	// main 밖에서 사용하기 위해서는 static으로 전역 선언 ...
	static final double PI = 3.141592;

	public static void main(String[] args) {
		double radius, area, circumference;
		
		// Double.parseDouble -> 가장 중요핝 부분 
		// 일반 문자나 특수 기호 등이 들어올 경우 오류 발생 !! 
		radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter radius: "));
		
		// Compute area and circumference
		area = PI * radius * radius;
		circumference = 2.0 * PI * radius;
		
		JOptionPane.showMessageDialog(null, "Giben Radius: " + radius + "\nArea :" + area + "\nCircumference: " + circumference);
	}

}
