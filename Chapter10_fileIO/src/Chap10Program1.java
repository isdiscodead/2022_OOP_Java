import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chap10Program1 {

	public static void main(String[] args) throws IOException {
		
		// set up file amd stream
		File outFile = new File("./example1.data"); // 1. 파일 이름 만들기 
		FileOutputStream outStream = new FileOutputStream(outFile); // 2. 스트림에 넣어주기 
		
		// data to save
		byte[] byteArr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		// low-level -> binary ... can't read !! 
		
		// write data to the stream
		outStream.write(byteArr);
		
		// output done, so close the stream
		outStream.close();
	}

}
