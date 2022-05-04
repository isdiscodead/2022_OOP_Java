import java.util.Vector;

/**
 * Chap9Program3 : Example of Vector Usage with Integer Generic
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-20
 *
 */


public class Chap9Program3 {

	public static void main(String[] args) {
		
		// Vector는 유연한 메모리 spacing 가능 ! 
		Vector<Integer> v = new Vector<Integer>();
		
		// Array는 static하게 spacing되므로 추가 불가능 ... 
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); // 인덱스 2에 삽입 
		
		System.out.println("# of elements : " + v.size() );
		System.out.println("Capacity of the vector : " + v.capacity() );
		
		for ( int i=0 ; i<v.size() ; i++ ) {
			int n = v.get(i);
			System.out.println(n);
		}
	}

}
