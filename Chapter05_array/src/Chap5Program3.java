import java.util.Scanner;

/*
 * 2022-03-30
 * Find the smallest Num
 * Lee Jiwon
 * */


public class Chap5Program3 {
	static final int SIZE = 5;
	public static void main(String[] args) { 
		
		int[] nums = new int[SIZE];
		int min;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input " + SIZE + " integer numbers >> ");
		
		// input part 
		for( int i=0 ; i < nums.length ; i++ ) { // hard coding 지양하기 !! 
			nums[i] = scanner.nextInt();
		}
		
		// computation
		min = nums[0];
		for ( int i=1 ; i <  nums.length ; i++ ) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		// output 
		System.out.print("min value is ");
		System.out.print(min);
		
		scanner.close();
	}
}
