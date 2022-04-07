
public class Bicycle {
	// bicycle의 속성 값 -> 데이터 멤버 -> getter/setter 
	private String ownerName = "";
	
	// 생성자 ( Constructor )
	public Bicycle() {
		ownerName = "unknown";
		System.out.println("new Bike");
	}
	
	
	// setter -> main 등 에서 값을 받아와서 객체가 생성됐을 때 멤버변수의 값을 지정해주는 function 
	public void setOwnerName(String name) {
		this.ownerName = name; // this늕 이 상황에서는 안 써도 됨 ~~ ...
		// owner = owner 같은 느낌일 때 헷갈리지 않도록 해주는 ... 
		// 이 클래스의 객체 자체를 뜻함 
	}
	
	// getter -> 클래스 내의 private 멤버 변수의 값을 밖에서도 확인할 수 있도록 반환해주는 function 
	public String getOwnerName() {
		return this.ownerName;
	}
}
 