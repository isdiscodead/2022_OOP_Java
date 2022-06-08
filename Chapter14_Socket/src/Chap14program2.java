import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chap14program2 { // Server 

	public static void main(String[] args) {

		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			socket = new Socket("localhost", 9999); // computer = server ... 127.0.0
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while ( true ) {
				
				System.out.println("Client >>");
				String outputMessage = scanner.nextLine();
				
				
				
				if ( outputMessage.equalsIgnoreCase("bye") ) {
					out.write(outputMessage + '\n');
					out.flush(); // flush the buffer 
					break;
				}
				
				out.write(outputMessage + '\n');
				out.flush(); // flush the buffer 
				
				String inputMessage = in.readLine();
				System.out.println("Sever : " + inputMessage);
				
			}	
		} catch ( IOException e ) {
			System.out.println("An error occurred while communicating with the client");
		}

	}

}
