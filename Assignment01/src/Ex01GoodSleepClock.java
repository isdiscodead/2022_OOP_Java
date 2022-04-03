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
	
	final static int MIN_UNIT = 1000*60;
	
	public static int[] findSleepTime(int age) {
		// 나이 별로 적정 수면 시간 나누기
		// https://my-nutri.co.kr/%EC%88%98%EB%A9%B4-%EC%A3%BC%EA%B8%B0-%EA%B3%84%EC%82%B0/ 참
				
		int[] sleepTimes = new int[2]; // [0]이 minSleepTime, [1]이 maxSleepTime

		if ( age < 1 ) {
			sleepTimes[0] = 12;
			sleepTimes[1] = 15;
			
		} else if ( age < 3 ) {
			sleepTimes[0] = 11;
			sleepTimes[1] = 14;
			
		} else if ( age < 6 ) {
			sleepTimes[0] = 10;
			sleepTimes[1] = 13;
			
		} else if ( age < 14 ) {
			sleepTimes[0] = 9;
			sleepTimes[1] = 11;
			
		} else if ( age < 18 ) {
			sleepTimes[0] = 8;
			sleepTimes[1] = 10;
			
		}  else if ( age < 65 ) {
			sleepTimes[0] = 7;
			sleepTimes[1] = 9;
			
		} else {
			sleepTimes[0] = 7;
			sleepTimes[1] = 8;
		}
		
		
		return sleepTimes;
	}
	
	public static String findWakeUpTime(Date date, int wakeUpTime, int[] sleepTimes) {
		// 반환 포맷 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd\nHH:mm");
		Date result = new Date();
		result.setTime(date.getTime());
		
		// date는 원하는 기상 시간으로 변경
		date.setHours(wakeUpTime);
		date.setMinutes(0);
		
		if ( result.getHours() >= date.getHours() ) { // 날이 넘어갔을 경우 1일 +
			date.setDate(date.getDate()+1);	
			result.setDate(result.getDate()+1);
		}
		
		result.setHours(result.getHours()+sleepTimes[1]);
		
		// 최대 수면 시간보다 기상 시간이 늦으면 최대 수면 시간으로 설정 
		if ( result.getTime() < date.getTime() ) {
			return sdf.format(result);
		}
		
		// 수면 가능 시간이 15분 미만일 경우 그냥... 안 자는 게
		Date tmp = new Date();
		if ( date.getTime() - tmp.getTime() <= MIN_UNIT*15 ) {
			return "You should awake rather than sleep...";
		}
 
		// 수면 가능 시간이 90분 이하일 경우 15분 단위 변경 
		if ( date.getTime() - tmp.getTime() <= MIN_UNIT*90 ) {
			result.setTime(date.getTime());
			while ( result.getTime() >= date.getTime() ) {
				result.setTime(result.getTime()-MIN_UNIT*15);
			}
			
			return sdf.format(result);
		}
		
		// 최대 시간으로 잤을 때 기상 시간 넘어가면 최소 시간까지 30분 단위 변경 
		while ( result.getTime() >= date.getTime() ) {
			result.setTime(result.getTime()-MIN_UNIT*30);
			if ( result.getTime() < date.getTime()-((sleepTimes[1]-sleepTimes[0])*MIN_UNIT*60) ) {
				break;
			}
		}
			
		// 최대-최소 두 케이스 모두 기상 시간보다 늦으면 90분 단위로 줄이기
		while ( result.getTime() >= date.getTime() ) {
			result.setTime(result.getTime()-MIN_UNIT*90);
		}
		
		return sdf.format(result);
	}
	
	public static void main(String[] args) {
		String name, wake; // 사용자 이름, 기상 시간의 정보
		int age=-1, wakeUpTime;
		int[] sleepTimes; // 적정 수면 시간 
		
		// 사용자 이름 입력 ( 사실 필요 없음 ㅠ String 쓰래서 )
		name = JOptionPane.showInputDialog(null, "Hello, What's your name?");
		JOptionPane.showMessageDialog(null, "Nice to meet you, " + name + ".");
		
		// 사용자 나이 입력 ( 계산을 위함 )
		while ( age < 0 ) {
			age = Integer.parseInt( JOptionPane.showInputDialog(null, "Please input your age. (0 ~ )") );
		}
		
		// 원하는 기상 시간 선택 ( 24시간 기준, 1시간 단위 ) 
		// 원래는 exception handling 필요 
		wakeUpTime = Integer.parseInt( JOptionPane.showInputDialog(null, "Please input when you should wake up by ( 24hr format, int )") );
		
		// 적정 수면 시간 
		sleepTimes = findSleepTime(age);
		
		// 현재 시간 불러오기
		Date date = new Date();
		
		// computation part
		wake = findWakeUpTime(date, wakeUpTime, sleepTimes);
		
		// output 
		if ( wake == "You should awake rather than sleep..." ) {
			JOptionPane.showMessageDialog(null, wake);
		} else {
			JOptionPane.showMessageDialog(null, name+ ", you should wake up at...\n " + wake );
		}
		
	}
	
}
