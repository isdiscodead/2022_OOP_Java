
public class Chap13Program5 {
	
	public static final int NUM_THREAD = 8;
	public static final int REP_TIMES = 2000000000;
	
	public Chap13Program5() throws InterruptedException {
		long start = System.currentTimeMillis();
		SumThread.sum = 0; // static 
		
		SumThread[] threads = new SumThread[NUM_THREAD];
		
		// 분할하여 동시에 작업 !! 
		for ( int i=0 ; i<threads.length; i++ ) {
			threads[i] = new SumThread( i * (REP_TIMES/NUM_THREAD),
										(i+1) * (REP_TIMES/NUM_THREAD) - 1);
			
			threads[i].start();
		}
		
		// merge 
		// bottle neck effect로 8로 나눈 만큼 실행 속도가 좋아지진 않음 
		for ( int i=0 ; i<threads.length ; i++ ) {
			threads[i].join();
		}
		
		System.out.println("Total sum: " + SumThread.sum);
		long end = System.currentTimeMillis();
		
		System.out.println("Elapsed Time : " + (end-start) / 1000.0 + "sec." );
	}

	public static void main(String[] args) throws InterruptedException {
		new Chap13Program5();
	}

}
