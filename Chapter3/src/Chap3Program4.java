import java.util.*;

/* 
 * Chap3Program4 Sample Program : SelfCheck1
 * 2022/03/23
 * Implemented by Jiwon Lee 
 * 
 */

public class Chap3Program4 {
	
	static final int UNIT_CHANGER = 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the seconds unit as integer value >>");
		int time = scanner.nextInt();
		int hour, min, sec;
		
		hour = ( time / UNIT_CHANGER ) / UNIT_CHANGER;
		min = ( time / UNIT_CHANGER ) % UNIT_CHANGER;
		sec = time % UNIT_CHANGER;
		
		System.out.println(time + " seconds is " + hour +"hour, " + min + "minute, and " + sec + "seconds.");
				
	}

}
