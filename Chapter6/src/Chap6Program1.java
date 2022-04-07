
public class Chap6Program1 {

	public static void main(String[] args) {
		// 2x4 배열 -> 1~4학년 1학기, 1~4학년 2학
		double[][] score = { {4.0, 4.0, 4.5, 4.5}, {4.5, 4.5, 4.5, 4.0} };
		// 4x2 배열 -> 1학년 1~2학기, 2학년 1~2학기 ...
		// double[][] score = { {4.0, 4.5}, {4.0, 4.5}, {4.5, 4.5}, {4.5, 4.0} };
		// 이 경우 column 사이를 와리가리해서 실행 복잡  
		
		double sum = 0;
		 
		// 그냥 i, j, k 사용해도 OK 
		for ( int semester=0 ; semester < score.length ; semester++ ) {
			for ( int year=0 ; year < score[0].length ; year++ ) {
				sum += score[semester][year];
			}
		}
		
		System.out.println( "Avg. grade : " + sum/score.length/score[0].length );
	}

}
