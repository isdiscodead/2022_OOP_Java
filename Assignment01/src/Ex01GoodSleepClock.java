import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * 2022-03-28
 * Implementing a good sleep clock by using String, Date, SimpleDateFormat class.
 * Implemented by Jiwon Lee 
 * 
 */

public class Ex01GoodSleepClock {
	public static void main(String[] args) {
		String name;
		int age, wakeUpTime;
		
		// 사용자 이름 입력 ( 사실 필요 없음 ㅠ String 쓰래서 )
		// name = JOptionPane.showInputDialog(null, "Hello, What's your name?");
		// JOptionPane.showMessageDialog(null, "Nice to meet you, " + name + ".");
		
		// 사용자 나이 입력 ( 계산을 위함 )
		// age = Integer.parseInt( JOptionPane.showInputDialog(null, "Please input your age.") );
		
		// 원하는 기상 시간 선택 ( 24시간 기준, 1시간 단위 ) 
		// 원래는 exception handling 필요 
		// wakeUpTime = Integer.parseInt( JOptionPane.showInputDialog(null, "Please input when you should wake up by ( 24hr format, int )") );
		
		// 현재 시간 불러오기 및 sdf 생성 
		Date date = new Date();
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd\nHH:mm:ss");
	}
	
}
