import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Q6. English <-> Korean translation program
 * Assign at least 10 English words to the array.
 * Input english sentence and translate
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-22
 *
 */

public class Q6 {
	
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();
		String input, result="";
		String[] words;
		Scanner scanner = new Scanner(System.in);
		
		// data
		dictionary.put("apple", "사과");
		dictionary.put("is", "는");
		dictionary.put("red", "빨간색");
		dictionary.put("delicious", "맛있다");
		dictionary.put("strawberry", "딸기");
		dictionary.put("banana", "바나나");
		dictionary.put("yellow", "노란색");
		dictionary.put("he", "그");
		dictionary.put("she", "그녀");
		dictionary.put("kind", "친절하다");
		dictionary.put("smart", "똑똑하다");
		dictionary.put("brave", "용감한");
		
		// input 
		input = scanner.nextLine();
		
		// seperate into words
		words = input.split(" ");

		// tanslate in for loop 
		for ( int i=0 ; i<words.length ; i++ ) {
			if ( dictionary.containsKey(words[i]) ) {
				result += dictionary.get(words[i]);

			} else {
				result += "모름";
			}
			
			if ( (i<words.length-1) && ( ! words[i+1].equals("is")) ) {
				result += " ";
			}
		}
		
		System.out.println(result);
	
		
	}

}
