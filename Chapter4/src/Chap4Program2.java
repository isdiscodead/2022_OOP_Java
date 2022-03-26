import java.util.Scanner;

/*
 * Chap4Program1 : Example program for switch-case statement -> Self Check
 * 2022-03-23
 * Implemeted by Jiwon Lee
 * */


public class Chap4Program2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Input UI
		char grade;
		System.out.print("Please input the score (0 - 100 scale): ");
		int score = scanner.nextInt();
		
		
		// Calculation ( main )
		// c언어와 마찬가지로 정수 / 정수는 정수 나눗셈 !! 
		// 마찬가지로 케이스 여러개 이어서 쓰면 두 케이스에 대해 작성 가능 
		switch(score/10) { // switch문의 경우 조건(score/10)을 1번 계산하지만 if문은 여러번 계산하게 됨 
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default: 
			grade = 'F';
		}
		
		// Output UI
		System.out.println("Grade will be " + grade);
		scanner.close(); // scanner 사용 후엔 닫아줘서 메모리 낭비 막기 
		
	}

}
