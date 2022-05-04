import java.util.Date;

/*
 * measure execution time by Date class
 * */

public class Chap4Program5 {

	static final int REPEAT = 100000;
	public static void main(String[] args) {
		
		// Tic
		Date startTime = new Date();
		
		// Main Algorithm
		for ( int i=0 ; i<=REPEAT; i++ ) {
			for ( int j=0 ; j<=REPEAT ; j++ ) {
				for ( int k=0 ; k<=REPEAT ; k++ ) {
				}
			}
		}
		
		// Toc
		Date endTime = new Date();
		
		// Measure elapsed time for main algorithm
		long elapsedTimeInMilliSec = endTime.getTime() - startTime.getTime();
		
		// Print out elapsed time for main algorithm
		System.out.println("Elapsed Time: " + elapsedTimeInMilliSec + " ms");
	}
}
