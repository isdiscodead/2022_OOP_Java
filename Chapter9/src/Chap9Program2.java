import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Chap9Program2 : Example of Map Usage
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-20
 *
 */


public class Chap9Program2 {
	
	// list 사용 방법 
	private List books;
	
	public Chap9Program2() {
		books = new LinkedList();
	}
	

	public static void main(String[] args) {

		Map catalog; // Map -> Interface이므로 내부 내용 X
		catalog = new TreeMap(); // TreeMap -> 구현된 내용 
		
		// String array로 만들면 내용을 추가해야 될 경우, 새로 선언/할당해야 함 
		String[][] catalogStringArray = new String[3][2]; 
	
		
		// put()하면 끝! 제한 X
		catalog.put("CS101", "Intro Java Programmihng");
		catalog.put("CS301", "Database Design");
		catalog.put("CS413", "Software Design for Mobile Devices");
		catalog.put("CS202", "Big Data");
		
		// 제거는 remove(key)로 간단하게 ! 
		catalog.remove("CS301");
		
		// key로 value 가져오기
		System.out.println(catalog.get("CS202"));
		
		if ( catalog.containsKey("CS101") ) {
			System.out.println("We teach Java this semester");
		} else {
			System.out.println("No Java courses this semester");
		}

	}

}
