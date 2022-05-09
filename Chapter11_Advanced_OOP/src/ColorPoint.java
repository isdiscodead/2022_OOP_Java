/**
 * ColorPoint : Example of super()
 * 
 * @author isdiscodead
 * @version v0.1
 * @since 05-09-2022
 *
 */
public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint( int x, int y, String color ) {
		super(x, y); // 부모 클래스 Point의 생성자를 x, y로 호출 
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
