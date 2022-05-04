import java.util.Date;
// sql의 Date와 동일하지만 위의 것 사용! (공식적)

import java.text.SimpleDateFormat;

public class DateTest {

	public static void main(String[] args) {
		// JDK에 내장 X이므로 Date 사용 하기 위해서는 import 필요 
		Date date = new Date();	// new로 생성 시 현재의 실제 시간으로 만들어짐 
		
		// toString() : String으로 형변환
		System.out.println("String: "+ date.toString());
		
		
		// Simple Date Format -> 데이트의 포멧을 정해서 보기 좋게 ! 
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
		
		// dd는 날짜 yy는 2글자 연도 
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf1.format(date));
		
		// MM은 월 mm은 분 
		sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date));
		
		sdf3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf3.format(date));
		
		sdf4 = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(sdf4.format(date));
		
		// a는 오전 / 오후 표시 
		// HH는 시간 ( 24시간 기준 ) hh는 12시간 기준 
		sdf5 = new SimpleDateFormat("HH:mm:ss a, E");
		System.out.println(sdf5.format(date));
		
	}
} 