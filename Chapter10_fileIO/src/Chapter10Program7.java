import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Chapter10Program7 {

	static int NUM_OF_ACCOUNT = 20;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File outFile = new File("./example4.data");
		
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
		
		// File로 만들고 읽고자 하는 객체는 Serializable 을 implements해야 함 ! 
		Account[] accounts = new Account[NUM_OF_ACCOUNT];
		
		// create objects 
		for ( int i=0 ; i<accounts.length ; i++ ) {
			accounts[i] = new Account();
			accounts[i].setOwerName("Student"+(i+1));
		}

		// write 
		outObjectStream.writeObject(accounts);
		
		outObjectStream.close();
		System.out.println("complete!!");
		
		// read object -> 역직렬화 
		File inFile = new File("./example4.data");
		FileInputStream inFileStream = new FileInputStream(inFile);
		
		// 읽어오기 
		ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
		Object object = inObjectStream.readObject();
		inObjectStream.close();
		
		// 형변환 필요 
		Account[] inputAccounts = (Account[])object;
		for ( int i=0 ; i<inputAccounts.length ; i++ ) {
			System.out.println(inputAccounts[i].getOwnerName());
		}
	}

}
