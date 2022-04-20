import java.util.Iterator;
import java.util.Vector;

/**
 * Chap9Program3 : Example of Vector Usage with Integer Generic
 * 
 * @author isdiscodead
 * @version 1.0
 * @since 2022-04-20
 *
 */


public class Chap9Program4 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(5);
		v.add(4);
		v.add(-1);

		v.add(2, 100);

		System.out.println("# of elements : " + v.size() );
		System.out.println("Capacity of the vector : " + v.capacity() );

		Iterator<Integer> it = v.iterator();

		while ( it.hasNext() ) {
			System.out.println(it.next());
		}

	}

}
