
public class Chap13Program4 {
	
	public Chap13Program4() {
		long start = System.currentTimeMillis();
		long sum = 0;
		
		// no Thread ... 
		for ( int i=0; i<2000000000; i++ ) {
			sum += i;
		}
		
		System.out.println("Total sum: " + sum);
		long end = System.currentTimeMillis();
		
		System.out.println("Elapsed Time : " + (end-start) / 1000.0 + "sec." );
	}

	public static void main(String[] args) {
		new Chap13Program4();
	}

}
