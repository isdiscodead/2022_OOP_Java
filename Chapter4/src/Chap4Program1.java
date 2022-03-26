/*
 * Chap4Program1 : Example program for conditional statement
 * 2022-03-23
 * Implemeted by Jiwon Lee
 * */


public class Chap4Program1 {

	public static void main(String[] args) {
		int firstNum = 10, secondNum = 5;
		
		// 절댓값 -> Math 클래스의 abs메서드 사용 
		int diffNum = Math.abs(firstNum - secondNum);
		
		// Conditional statement 사용하여 절댓값 구현 
		diffNum = ( firstNum > secondNum ) ? diffNum : -diffNum;
		
		// 위의 코드는 아래의 if문과 동일함
		if ( firstNum > secondNum ) {
			diffNum = firstNum - secondNum;
		} else {
			diffNum = secondNum - firstNum;
		}
		
		System.out.println("Difference between two values" + diffNum);
	}

}
