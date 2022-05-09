
public class Chap11_Roster_InstanceOf {

	public static void main(String[] args) {
		// 부모 클래스 배열로 자식 클래스도 담을 수 있음 !  
		Person[] roster = new Person[3];
		
		roster[0] = new Student();
		roster[1] = new Person();
		roster[2] = new Student();
		
		// method 실행 시 해당 인스턴스에 맞는 자식 클래스의 오버라이딩 method 실
		
		// instanceof 연산자로 어떤 클래스의 인스턴스인지 확인 가능
		for ( int i=0 ; i < 3 ; i++ ) {
			if ( roster[i] instanceof Student ) {
				System.out.println("Student");
			}
		}
	}

}
