import java.util.Scanner;

/**
 * 2022 OOP Midterm Exam Q4
 * Program that receives a total of 9 integers 
 * and outputs all received values, row sum, column sum, and total sum 
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q4 {
	
	final static int ROWSIZE = 3;
	final static int COLSIZE = 3;
	
	/**
	 * 
	 * @param arr
	 * @return rowSum 
	 */
	public static int[] getRowSum( int arr[][] ) {
		int rowSum[] = new int[arr.length];
		for ( int i=0 ; i<arr.length ; i++ ) {
			for ( int j=0 ; j<arr[0].length ; j++ ) {
				rowSum[i] += arr[i][j];
			}
		}
		return rowSum;
	}
	
	
	/**
	 * 
	 * @param arr
	 * @return colSum
	 */
	public static int[] getColSum( int arr[][] ) {
		int colSum[] = new int[arr[0].length];
		for ( int i=0 ; i<arr.length ; i++ ) {
			for ( int j=0 ; j<arr[0].length ; j++ ) {
				colSum[i] += arr[j][i];
			}
		}
		return colSum;
	}
	
	/**
	 * 
	 * @param arr
	 * @return sum
	 */
	public static int getSum( int arr[][] ) {
		int sum = 0;
		for ( int i=0 ; i<arr.length ; i++ ) {
			for ( int j=0 ; j<arr[0].length ; j++ ) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int[][] nums = new int[ROWSIZE][COLSIZE];
		Scanner scanner = new Scanner(System.in);
		
		// input 
		System.out.println("Please input 9 integer numbers");
		for ( int i=0 ; i<ROWSIZE; i++ ) {
			for ( int j=0 ; j<COLSIZE ; j++ ) {
				try {
					nums[i][j] = scanner.nextInt();
					
				} catch (Exception e) {
					j--;
					scanner.next();
					continue;
				}
			}
		}
		
		// output & calculation
		int[] rowSum = getRowSum(nums);
		int[] colSum = getColSum(nums);
		
		System.out.print("Sum of Rows : ");
		for ( int i=0 ; i<rowSum.length ; i++ ) {
			System.out.print(rowSum[i] + " ");
		}
		System.out.print("\nSum of Cols : ");
		for ( int i=0 ; i<colSum.length ; i++ ) {
			System.out.print(colSum[i] + " ");
		}
		System.out.println("\nSum of Total : " + getSum(nums));
		
		scanner.close();
	}
	
}
