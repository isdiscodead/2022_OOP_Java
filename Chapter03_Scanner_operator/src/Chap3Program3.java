import java.util.*;

/* 
 * Chap3Program3 Sample Program : SelfCheck1
 * 2022/03/21
 * Jiwon Lee 
 * 
 */

public class Chap3Program3 {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		// Assignment Operator
		a += 3;
		b *= 3;
		c %= 3;
		
		int d = 3;
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		// Increment & Decrement operator
		a = d++; // 현재 값 대입 후 증가 
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		a = ++d; // 증가 후 값 대입 
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		a = d--;
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		a = --d;
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
	}

}
