
public class Chap6Program6 {
	public static void main(String args[]) {
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for ( int i=0 ; i<5 ; i++ ) {
				intArray[i+1] = i + 1 + intArray[i];
				System.out.println("intArray["+i+"]"+" = "+intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 배열 크기 이상으로 index 접근 시 발생하는 에러 
			System.out.println("Out of index for intArray");
		}
	}
}
