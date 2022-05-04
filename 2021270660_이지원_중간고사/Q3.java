import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 2022 OOP Midterm Exam Q3
 * Program that calculates summation based on overloaded methods 
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q3 {
	
	/**
	 * 1) 
	 * @param firstNum, secondNum
	 * @return sum 
	 */
	public static int getSum(int firstNum, int secondNum ) {
		int sum=0;
		sum = firstNum + secondNum;
		return sum;
	}
	
	/**
	 * 1) 
	 * @param firstNum, secondNum, int thirdNum 
	 * @return sum 
	 */
	public static int getSum(int firstNum, int secondNum, int thirdNum ) {
		int sum=0;
		sum = firstNum + secondNum + thirdNum;
		return sum;
	}


	/**
	 * 2) 
	 * @param nums
	 * @return sum 
	 */
	public static int getSum(int[] nums ) {
		int sum=0;
		for( int i=0 ; i<nums.length ; i++ ) {
			sum += nums[i];
		}
		return sum;
	}

	
	/**
	 * 3) 
	 * @param nums
	 * @return sum 
	 */
	public static double getSum( double[] nums ) {
		double sum=0;
		for( int i=0 ; i<nums.length ; i++ ) {
			sum += nums[i];
		}
		return sum;
	}


	public static void main(String[] args) {
		List nums = new LinkedList<>(); 
		double[] numArr;
		Scanner scanner = new Scanner(System.in);
		
		// 4, 5) input UI 
		System.out.println("Please input double or integer number.");
		System.out.println("Input 'q' if you want to quit.");
		while ( true ) {
			try {
				double num = scanner.nextDouble();
				nums.add(num);
				
			} catch (Exception e) {
				String input = scanner.next();
				if ( input.equals("q") ) {
					break;
				}
				System.out.println("invalid input! ");
				continue;
			}
		}
		
		// trans
		int size = nums.size();
		numArr = new double[size];
		
		for ( int i=0 ; i<size ; i++ ) {
			numArr[i] = (double) nums.get(i);
		}
		
		// calculate 
		System.out.println("summation = " + getSum(numArr));

		scanner.close();
	}

}
