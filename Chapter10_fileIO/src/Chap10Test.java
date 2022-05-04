import java.io.File;

public class Chap10Test {

	public static void main(String[] args) {

		// File은 빈 생성자 존재 X 
		File testFile = new File("sample.dat");
		
		testFile.exists(); // 파일이 이미 존재하는지 확인 ( 자주 쓰임 )
		testFile.isFile(); // 파일이 맞는지 ... 
	}

}
