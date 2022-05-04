import javax.swing.JOptionPane;

/**
 * 2022 OOP Midterm Exam Q2
 * Program that input first, middel, and last name / output monogram 
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q2 {

	public static void main(String[] args) {
		// input -> full 버전으로 받거나 따로따로 받거나 ~
		String name = JOptionPane.showInputDialog(null, "Enter your full name (first, middle, last):");
		
		// monogram 구하기 
		String mono = "";		
		int idx = name.indexOf(" ")-1;
		mono += name.substring(idx, idx+1).toUpperCase();
		
		// 세 파트로 나뉘었을 때만 두 번째 이니셜 추가 
		int idx2 = name.lastIndexOf(" ")-1;

		
		if (idx != idx2) {
			mono += name.substring(idx2, idx2+1).toUpperCase();
		}

		// 마지막 인덱스 
		mono += name.substring(name.length()-1, name.length()).toUpperCase();
		
		
		// output
		System.out.println("Input Name: " + name);
		System.out.println("Monogram with last letters: " + mono);
	}

}
