import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Chap10Program2 {

	public static void main(String[] args) throws IOException {
		
		// set up file and stream
		File inFile = new File("./example1.data");
		FileInputStream inStream = new FileInputStream(inFile);
		
		// set up an array to read data in
		int fileSize = (int)inFile.length(); // file안의 element 개수 반환 
		// element 개수를 알 수 있기 때문에 array가 더 빠름 ( 메모리에 연달아 존재 )
		byte[] byteArr = new byte[fileSize];
		
		// read data in and display
		inStream.read(byteArr);
		
		for( int i=0 ; i<fileSize; i++ ) {
			System.out.println(byteArr[i]);
		}
		
		// input done, so close the stream
		inStream.close();
		
	}

}
