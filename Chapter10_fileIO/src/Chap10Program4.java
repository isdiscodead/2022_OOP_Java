import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Chap10Program4 {

	public static void main(String[] args) throws IOException {
		
		File inFile = new File("./example2.data");
		FileInputStream inStream = new FileInputStream(inFile);
		// read high-level data 
		DataInputStream inDataStream = new DataInputStream(inStream);
		
		// read each values 
		System.out.println("n = " + inDataStream.readInt()); // 바로 출력도 가능 
		
		// 잘못된 순서로 읽으려고 하면 데이터 깨짐 ... 
		// System.out.println("n = " + inDataStream.readBoolean()); 
		boolean b = inDataStream.readBoolean();
		double d = inDataStream.readDouble();
		
		inDataStream.close();
		
		System.out.println("b = " + b);
		System.out.println("d = " + d);
		
		// 존재하는 것 이상으로 출력 불가 !! 
		// System.out.println("n = " + inDataStream.readInt()); 

	}

}
