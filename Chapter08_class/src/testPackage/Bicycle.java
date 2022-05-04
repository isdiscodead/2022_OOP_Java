package testPackage;
/**
 * The Bicycle Class implements an application that
 * simply displays bike's owner based on multiple classes
 * 
 * @auther Jiwon Lee
 * @version 1.0
 * @since 2022-04-18
 * 
 * */

public class Bicycle {
	/**
	 * data member for owner's name ( String ) 
	 */
	// bicycle의 속성 값 -> data members -> getter/setter 
	private String ownerName; // 여기서는 선언만 
	
	
	/**
	 * constructor : initializes the data member
	 */
	// 생성자 ( Constructor ) -> 보통 매개변수를 달리해 다형성 있게 구현함 
	public Bicycle() {
		// this()는 항상 생성자의 맨 윗부분에 존재
		this("unknown"); // 생성자 호출, 잘 쓰이진 X 
		// ownerName = "unknown"; // datamember initialize
	}
	
	/**
	 * constructor of Bicycle class
	 * @param ownerName will be set on the data member
	 */
	// 생성자는 리턴 타입 X 
	// object를 매개변수로 받을 수도 있음 !! 똑같이 .으로 접근 
	public Bicycle(String ownerName) {
		this.ownerName = ownerName; // datamember initialize
		System.out.println("new Bike");
	}
	
	
	/**
	 * Assigns the name of this bicycle's owner
	 * @param name set the owner's name into data member
	 */
	// setter -> main 등 에서 값을 받아와서 객체가 생성됐을 때 멤버변수의 값을 지정해주는 function 
	public void setOwnerName(String name) {
		this.ownerName = name; // this늕 이 상황에서는 안 써도 됨 ~~ ...
		// owner = owner 같은 느낌일 때 헷갈리지 않도록 해주는 ... 
		// 이 클래스의 객체 자체를 뜻함 
	}
	
	/**
	 * Returns the name of this bicycle's owner
	 * @return ownerName;
	 */	
	// getter -> 클래스 내의 private 멤버 변수의 값을 밖에서도 확인할 수 있도록 반환해주는 function 
	public String getOwnerName() {
		return this.ownerName;
	}
}
 