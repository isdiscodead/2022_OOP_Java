/*
 * 2022 / 03 / 16
 * 
 * Get the user's first, middle, and last names
 * Extract initials
 * output monogram & date
 * 
 * implimented by Jiwon Lee
 * 
 * */

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chap2Program5 {

	public static void main(String[] args) {
		// input -> full 버전으로 받거나 따로따로 받거나 ~
		String name = JOptionPane.showInputDialog(null, "Please Enter the your full name with space. \n(first, middle, last)");
		
		// 이니셜 구하기 
		String initial = "";
		initial = initial + name.substring(0, 1);
		
		int idx = name.indexOf(" ")+1;
		initial = initial + name.substring(idx, idx+1);
		
		// 세 파트로 나뉘었을 때만 세번째 이니셜 추가 
		int idx2 = name.lastIndexOf(" ")+1;
		if (idx != idx2) {
			initial = initial + name.substring(idx2, idx2+1);
		}

		// 날짜 추가 
		SimpleDateFormat sdf = new SimpleDateFormat("(yyyy-MM-dd)");
		Date date = new Date();

		String monogram = initial +  " " + sdf.format(date);
		
		JOptionPane.showMessageDialog(null, monogram);
	}

}
