import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Q2. 1D array sorting
 * receives 8 integers, stores them in a 1-dimensional array, and sorts them in ascending order.
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-21
 *
 */

public class Q2 {
	
	/**
	 * size of input data
	 */
	public static int SIZE = 8;
	
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
			
			System.out.print("정수 입력: ");
			
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
		arr = sort(arr);
		for ( i=0 ; i<arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/**
	 * function that returns sum of an int array
	 * @param arr
	 * @return sortedArr
	 */
	public static int[] sort(int[] arr) {
		for ( int i=0 ; i<arr.length ; i++ ) {
			for ( int j=0 ; j<arr.length ; j++ ) {
				if ( arr[i] < arr[j] ) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		return arr;
	}

}
