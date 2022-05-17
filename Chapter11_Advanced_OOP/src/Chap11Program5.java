/**
 * Chap11Program5 : Example of Abstract class
 * 
 * @author isdiscodead
 *
 */

public class Chap11Program5 implements Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double avg = 0;
		
		for ( int i=0 ; i<a.length ; i++ ) {
			avg += a[i];
		}
		
		avg /= a.length;
		
		return avg;
	}

	public static void main(String[] args) {
		Chap11Program5 instance = new Chap11Program5();
		
		System.out.println(instance.add(2, 3));
		System.out.println(instance.subtract(2, 3));
		System.out.println(instance.average( new int[] { 2, 3, 4 } ));
	}
}
