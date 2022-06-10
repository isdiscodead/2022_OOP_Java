import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Chap14Program2 Client Program:
 * 
 * @author isdiscodead
 * @since 2022-06-08
 * @version 0.0.1
 */

public class Chap14Program2 {

	public static void main(String[] args) {

		Socket socket = null; // Client
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999); // computer = server ... 127.0.0...
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				System.out.print("Client>>");
				String outputMessage = scanner.nextLine(); // client 단에서 입력할 내용 Input 
				
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				
				out.write(outputMessage + "\n");
				out.flush();
				
				String inputMessage = in.readLine(); // buffer에서 Server 단의 내용 받아오기 
				System.out.println("Server: " + inputMessage);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());		
			
		} finally { // 마지막에 다 닫아주기 
			try { 
				scanner.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				System.out.println("An error occurred while communicating with the server.");
			}
		}
	}
}
