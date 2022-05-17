/**
 * Shape : Example of Overriding for implementation of polymorphism
 * 
 * @author isdiscodead
 * @version v0.1
 * @since 05-11-2022
 */

// parent class 
public class Shape {
	public Shape next;
	
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

// 이 아래에 자식 클래스 생성해도 OK 
// 보통은 파일 새로 만듦 ...
