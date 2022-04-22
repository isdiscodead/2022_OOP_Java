import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Q1. Mean / Max value
 * receives 10 integer numbers from the user and outputs the maximum and average values. 
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-20
 *
 */

public class Q1 {
	
	/**
	 * size of input data
	 */
	public static int SIZE = 10;
	
	public static void main(String[] args) {
		
		/**
		 * input data ( int array )
		 */
		int arr[] = new int[SIZE];
		
		// variables for compute
		int num, i;
		Scanner scanner = new Scanner(System.in);
		
		// input 
		System.out.println("Please enter ten integers: ");
		
		for( i=0 ; i<SIZE ; i++ ) {
			
			if ( i==0 ) {
				System.out.print((i+1) + "st value >> ");
			} else if ( i==1 ) {
				System.out.print((i+1) + "nd value >> ");
			} else if ( i==2 ) {
				System.out.print((i+1) + "rd value >> ");
			} else {
				System.out.print((i+1) + "th value >> ");
			}
			
			try {
				num = scanner.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("Input value is not an integer. Please retype the value.");
				scanner.next(); // clear the buffer 
				i--;
				continue;
			}
			
			arr[i] = num;
		}
		
		scanner.close();
		
		// computation & output
		System.out.println("Maximum value: " + max(arr) );
		System.out.println("Average value: " + mean(arr) );
	}
	
	
	/**
	 * function that returns sum of an int array
	 * @param arr
	 * @return sum
	 */
	public static int sum(int[] arr) {
		int sum=0;
		
		for( int i=0 ; i<arr.length ; i++ ) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	/**
	 * function that returns max value of an int array
	 * @param arr
	 * @return max
	 */
	public static int max(int[] arr) {
		int max=arr[0];
		
		for( int i=1 ; i<arr.length ; i++ ) {
			if ( max < arr[i] ) {
				max = arr[i];
			}
		}
		
		return max;
	}

	
	/**
	 * function that returns mean of an int array
	 * @param arr
	 * @return mean
	 */
	public static double mean(int[] arr) {
		return sum(arr) / (double)arr.length;
	}


}
