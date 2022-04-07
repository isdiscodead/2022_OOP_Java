import java.util.Scanner;

public class Chap6Program7 {
	
	final static int SIZE = 3;

	public static void main(String[] args) {
		int n, sum=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input 3 integers");
		int i=0 ;
		for ( i=0 ; i < SIZE ; i++ ) {
			try {
				n = scanner.nextInt();
			} catch ( NumberFormatException e ) {
				System.out.println("Please input in integer format");
				i--;
				continue;
			}
			sum += n;
		}

		System.out.println("sum: " + sum);
		scanner.close();
	}
}
