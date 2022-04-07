import java.util.Scanner;

public class Chap6Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diviend=0, divisor=1;
		
		try {
			System.out.print("Dividend: ");
			diviend = scanner.nextInt();
			
			System.out.print("Divisor: ");
			divisor = scanner.nextInt();	
			
		} catch ( NumberFormatException e ) { // 포맷 안 맞을 때 
			System.out.println("You should input another value ( int )");
			
			System.out.print("Divisor: ");
			divisor = scanner.nextInt();	
		}
		
		try {
			System.out.println(diviend+"/"+divisor+" = "+(double)diviend/divisor);
			
		} catch ( ArithmeticException e ) { // 0으로 나눌 때 등 산술적 오류 
			System.out.println("You should input another divisor ( non zero )");
			
			// 다시 입력 받아야 함
			System.out.print("Divisor: ");
			divisor = scanner.nextInt();	
			
			System.out.println(diviend+"/"+divisor+" = "+(double)diviend/divisor);
		}
			
		scanner.close();

	}

}
