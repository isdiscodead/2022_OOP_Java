import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Chapter10Program7 {

	static int NUM_OF_ACCOUNT = 20;
	
	public static void main(String[] args) throws IOException {
		
		File outFile = new File("./example4.data");
		
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
		
		Account[] accounts = new Account[NUM_OF_ACCOUNT];
		
		// create objects 
		for ( int i=0 ; i<accounts.length ; i++ ) {
			accounts[i] = new Account();
			accounts[i].setOwerName("Student"+(i+1));
		}

		outObjectStream.writeObject(accounts);
		
		outObjectStream.close();
		System.out.println("complete!!");
		
		// read object -> 컴퓨터 구조를 좀 알아야 ?... 블로그 읽어보기 
		File inFile = new File("./example4.data");
		FileInputStream inFileStream = new FileInputStream(inFile);
		ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
	}

}
