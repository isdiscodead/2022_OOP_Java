import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/* 
 * GUI program that tells you if the day is spring, summer, fall, or winter
 * 2022/04/01
 * Implemented by Jiwon Lee 
 * https://nota.tistory.com/entry/JAVA-String-to-Date-Date-to-String-%ED%98%95%EB%B3%80%ED%99%98 참고하였음 
 * 
 */

public class Ex04KoreanSeason {

	public static void main(String[] args) throws ParseException { // 근데 이거 에러 꼭 둘러야 되는 건가 ?? 
		String inputDate, season;
		int month;
		
		// Input 
		inputDate = JOptionPane.showInputDialog(null, "Please input date in format 'YYYY-MM-DD'");
		
		// Parse String to Date
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = transFormat.parse(inputDate);
		
		// figure out season
		month = date.getMonth()+1; // 월은 0부터 시작 
		System.out.println(inputDate+"   "+date+"   "+month);
		
		if ( month>2 && month<6 ) {
			season = "spring";
		} else if ( month>5 && month<9 ) {
			season = "summer";
		} else if ( month>8 && month<12 ) {
			season = "fall";
		} else {
			season = "winter";
		}
		
		// output 
		JOptionPane.showMessageDialog(null, inputDate + " is " + season);
		
	}

}
