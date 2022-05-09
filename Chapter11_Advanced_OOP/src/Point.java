/**
 * Point : Example of super()
 * 
 * @author isdiscodead
 * @version v0.1
 * @since 05-09-2022
 *
 */
public class Point {
	
	private int x, y;
	
	public Point() {
		this.x = this.y = 0;
	}
	
	// 매개변수가 있는 생성자 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
