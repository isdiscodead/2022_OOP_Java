import java.util.Scanner;

/*
 * 2022-03-30
 * Find the largest Num
 * Lee Jiwon
 * */


public class Chap5Program2 {
	static final int SIZE = 5;
	public static void main(String[] args) { 
		
		int[] nums = new int[SIZE];
		int max;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input " + SIZE + " integer numbers >> ");
		
		// input part 
		for( int i=0 ; i < nums.length ; i++ ) { // hard coding 지양하기 !! 
			nums[i] = scanner.nextInt();
		}
		
		// computation
		max = nums[0];
		for ( int i=1 ; i <  nums.length ; i++ ) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		// output 
		System.out.print("max value is ");
		System.out.print(max);
		
		scanner.close();
	}
}
