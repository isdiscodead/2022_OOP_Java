import java.util.Formatter;
import java.util.Scanner;

/* 
 * CUI program that tells you the optimal (Minimal) number of bills
 * 2022/03/31
 * Implemented by Jiwon Lee 
 * 
 */


public class Ex03OptimalBill {

	public static void main(String[] args) {
		int amount, won;
		// 각 단위의 개수 ... 1원은 그래도 일단 넣어줬습니다 ㅠ 
		int cnt_50000=0, cnt_10000=0, cnt_5000=0, cnt_1000=0, cnt_500=0, cnt_100=0, cnt_50=0, cnt_10=0, cnt_1=0;
		
		// Input 
		System.out.println("Please input amount of money in integer.");
		Scanner scanner = new Scanner(System.in);
		won = scanner.nextInt();
		amount = won; // 계산을 위해 값 복사 
		
		
		// Calculation
		// 0원이 될 때까지 가장 큰 단위로 나눠주기 
			
			if ( amount >= 50000 ) {
				cnt_50000 = (amount - amount%50000)/50000;
				amount -= cnt_50000 * 50000;
			} if ( amount >= 10000 ) {
				cnt_10000 = (amount - amount%10000)/10000;
				amount -= cnt_10000 * 10000;
			} if ( amount >= 5000 ) {
				cnt_5000 = (amount - amount%5000)/5000;
				amount -= cnt_5000 * 5000;
			} if ( amount >= 1000 ) {
				cnt_1000 = (amount - amount%1000)/10000;
				amount -= cnt_1000 * 1000;
			} if ( amount >= 500 ) {
				cnt_500 = (amount - amount%500)/500;
				amount -= cnt_500 * 500;
			} if ( amount >= 100 ) {
				cnt_100 = (amount - amount%100)/100;
				amount -= cnt_100 * 100;
			} if ( amount >= 50 ) {
				cnt_50 = (amount - amount%50)/50;
				amount -= cnt_50 * 50;
			} if ( amount >= 10 ) {
				cnt_10 = (amount - amount%10)/10;
				amount -= cnt_10 * 10;
			} 
			{
				cnt_1 = amount;
				amount -= amount;
			}
		
		
		scanner.close();
		
		// Output
		Formatter formatter = new Formatter(System.out);
		
		// 배열로 하고 싶ㄷ ㅏ... . .
		if ( cnt_50000!=0 ) 
			formatter.format("50000원 %d개, ", cnt_50000);
		if ( cnt_10000!=0 ) 
			formatter.format("10000원 %d개, ", cnt_10000);
		if ( cnt_5000!=0 ) 
			formatter.format("5000원 %d개, ", cnt_5000);
		if ( cnt_1000!=0 ) 
			formatter.format("1000원 %d개, ", cnt_1000);
		if ( cnt_500!=0 ) 
			formatter.format("500원 %d개, ", cnt_500);
		if ( cnt_100!=0 ) 
			formatter.format("100원 %d개, ", cnt_100);
		if ( cnt_50!=0 ) 
			formatter.format("50원 %d개, ", cnt_50);
		if ( cnt_10!=0 ) 
				formatter.format("10원 %d개, ", cnt_10);
		if ( cnt_1!=0 ) 
			formatter.format("1원 %d개 ", cnt_1);
		
	}

}
 