/*
 * 2022-03-30
 * Chap5Program1 : Test code for lecture array
 * Implemented by Jiwon Lee
 * */

public class Chap5Program1 {

	public static void main(String[] args) {
		// array는 C, C++과 동일하게 선언 시에는 [] 생성 시에는 [size]
		// 값으로 직접 초기화 시에는 size 상관 X 
		
		// array dec-cre-assign
		int[] b = {1,2,3,4,5};	// datatype[size] var
		int c[] = {6,7,8,9,10}; // datatype var[size] 
		
		// array dec
		int[] a;
		// array cre
		a = new int[5]; // new 키워드 사용해줘야 함 ! 
		
		// array dec-cre 
		int[] array = new int[5];
		
		
		// 배열 변수는 배열의 시작 주소 !! 따라서 주소가 복사됨 
		String[] arr = {"One", "Two", "Three", "Four", "Five"};
		String[] arrCopy = arr;
		System.out.println(arrCopy[1]);
		arr[1] = "Oneeeee"; // 원본 변경하면 복사본도 당연히 변경된 상태 
		System.out.println(arrCopy[1]);
	}

}
