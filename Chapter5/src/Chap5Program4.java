import java.util.Scanner;

/*
 * 2022-03-30
 * Find the mean of Nums + Functionalize min/max 
 * Lee Jiwon
 * */


public class Chap5Program4 {
	
	static final int SIZE = 5;
	
	// 최솟값 
	public static int min(int[] nums) {
		int min = nums[0];
		for ( int i=1 ; i <  nums.length ; i++ ) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	// 최댓값 
	public static int max(int[] nums) {
		int max = nums[0];
		for ( int i=1 ; i <  nums.length ; i++ ) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	// 평균 
	public static double mean(int[] nums) {
		double mean = 0;
		for ( int i=0 ; i <  nums.length ; i++ ) {
			mean += nums[i];
		}
		mean /= nums.length;
		return mean;
	}
	
	
	public static void main(String[] args) { 
		
		int[] nums = new int[SIZE];
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input " + SIZE + " integer numbers >> ");
		
		// input part 
		for( int i=0 ; i < nums.length ; i++ ) { // hard coding 지양하기 !! 
			nums[i] = scanner.nextInt();
		}
		
		// output & computation
		// main function -> static ... variable 생성 시 메모리 사용됨 
		// 일반 method들의 변수들은 return 시 사라짐 
		System.out.println("========functional=========");
		System.out.println("min value is " + min(nums));
		System.out.println("max value is " + max(nums));
		System.out.println("mean of values is " + mean(nums));
		
		scanner.close();
	}
}
