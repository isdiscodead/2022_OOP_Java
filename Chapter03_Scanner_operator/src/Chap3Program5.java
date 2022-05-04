import java.util.*;

/* 
 * Chap3Program4 Sample Program : Self Asignment
 * Year Month Day Hour Min Sec 
 * 2022/03/23
 * Implemented by Jiwon Lee 
 * 
 */

public class Chap3Program5 {
	
	static final int TIME_UNIT = 60;
	static final int YEAR_UNIT = 365;
	static final int MONTH_UNIT = 30;
	static final int DAY_UNIT = 24;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the seconds unit as integer value >>");
		int input = (int)scanner.nextDouble();
		int time = input;
		int year, month, day, hour, min, sec;

		year = ( time / TIME_UNIT / TIME_UNIT ) / DAY_UNIT / YEAR_UNIT;
		time -= year * TIME_UNIT * TIME_UNIT * DAY_UNIT * YEAR_UNIT;
		
		
		month = ( time / TIME_UNIT / TIME_UNIT ) / DAY_UNIT / MONTH_UNIT;
		time -= month * TIME_UNIT * TIME_UNIT * DAY_UNIT * MONTH_UNIT;
		
		day = ( time / TIME_UNIT / TIME_UNIT ) / DAY_UNIT;
		time -= day * TIME_UNIT * TIME_UNIT * DAY_UNIT;
		
		hour = ( time / TIME_UNIT ) / TIME_UNIT;
		min = ( time / TIME_UNIT ) % TIME_UNIT;
		sec = time % TIME_UNIT;
		
		System.out.print(input + " seconds is " + year + "year, " + month + "month, " + day + " days, ");
		System.out.print(hour +"hour, " + min + "minute, and " + sec + "seconds.");
	}

}
