/**
 * Chap11Program3 : Example of Overriding for implementation of polyporphism
 * @author isdiscodead
 * @version v0.1
 * @since 05-11-2022
 *
 */
public class Chap11Program3 {

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
	
	static void paint( Shape p ) {
		p.draw();
	}

}