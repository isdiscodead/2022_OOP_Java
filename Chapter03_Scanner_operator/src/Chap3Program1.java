// Scanner는 util 패키지에 ㅇ잇음! !
import java.util.*; 

/* 
 * Chap3Program2 Sample Program : Standard I/O
 * 2022/03/23
 * Implemented by Jiwon Lee 
 * 
 */

public class Chap3Program1 {

	public static void main(String[] args) {
		System.out.println("What's your name?");
		System.out.print("name: "); // print()는 println()과 다르게 줄바꿈 X
		
		Scanner scanner = new Scanner(System.in);
		// next()는 space 기준으로 그 전까지만 읽음 
		// 문장으로 입력받으려면 for문 + 콩캣 
		String name = scanner.next();
		
		// next__() 메서드들로 형태 지정 가능  
		
		System.out.println("Hello, " + name);
	}

}
