
public class Chap6Program3 {

	final static int SIZE = 4;
	
	public static void main(String[] args) {
		
		// 이렇게 선언할 거면 따로 array를 만드는 메서드 만들 필요 X
		// 잠시, 여러번 사용되는 array를 잠깐 쓰고 반환할 때 메서드가 유용한 것 !! 
		int intArray[] = makeArray();
		
		for ( int i=0 ; i < intArray.length ; i++ ) {
			System.out.print(intArray[i] + " ");
		}
	}
	
	public static int[] makeArray() {
		int temp[] = new int[SIZE];
		for ( int i=0 ; i < temp.length ; i++ ) {
			temp[i]=i+1;
		}
		return temp;
	}

}
