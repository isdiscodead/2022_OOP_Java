import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * High-level File I/O
 * @author isdiscodead
 *
 */
public class Chap10Program3 {

	public static void main(String[] args) throws IOException { // exception throw 필수 
		
		// open file output stream
		File outFile = new File("./example2.data");
		FileOutputStream outStream = new FileOutputStream(outFile); 
		// 추가된 단계 ( High-level )... data를 캡슐화 ( primitive data type values )
		DataOutputStream outDataStream = new DataOutputStream(outStream); 
		
		// write an int, boolean, double
		outDataStream.writeInt(44);
		outDataStream.writeBoolean(true);
		outDataStream.writeDouble(7.2);
		
		// close the stream
		outDataStream.close();

	}

}
