import java.io.*;
import java.net.*;
import java.util.*;

public class Chap14Program4 { // Client Program 
	public static void main(String[] args) {

		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999); // computer = server ... 127.0.0...
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				System.out.print("Formula (e.g.:12 + 3)>>"); 
				String outputMessage = scanner.nextLine(); // client 단에서 입력할 내용 Input 
				
				if (outputMessage.equalsIgnoreCase("bye")) { 
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				
				out.write(outputMessage + "\n");
				out.flush();
				
				String inputMessage = in.readLine(); // Server에서 result 받아오기 
				System.out.println("Result: " + inputMessage);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("An error occurred while communicating with the client.");
			}
		}
	}
}