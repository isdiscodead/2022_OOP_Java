/**
 * Student : Example of Inheritance 
 * 
 * @author isdiscodead
 * @version v0.1
 * @since 05-09-2022
 *
 */

public class Student extends Person { // Person class를 상속 받음 
	
	// 상속 -> super 클래스의 멤버변수( private 제외 ), method 등을 그대로 가짐 
	// 함수 등은 다시 재정의하여 다형성 구현 가능 ! 
	
	public void set() {
		age = 39;
		name = "PSY";
		height = 182;
		// weight = 99; -> private이므로 접근 권한 없음 
		setWeight(99); // setter 사용하여 접근 ! 
	}
	
	public void display() {
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
	}
}
