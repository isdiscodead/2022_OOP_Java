import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * High-level File I/O - 2
 * @author isdiscodead
 *
 */
public class Chap10Program5 {

	public static void main(String[] args) throws IOException { // exception throw 필수 
		
		// open file output stream
		File outFile = new File("./example3.data");
		FileOutputStream outFileStream = new FileOutputStream(outFile); 
		
		// print로 파일을 쓸 수 있는 PrintWriter ! 
		// direct readable 
		PrintWriter outStream = new PrintWriter(outFileStream);
		
		// write an int, boolean, double, String
		outStream.println(44);
		outStream.println(true);
		outStream.println(7.2);
		outStream.println("Hello, world.");
		
		// close the stream
		outStream.close();
		
		System.out.println("Completed...");

	}

}
