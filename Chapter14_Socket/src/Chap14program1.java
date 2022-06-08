import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chap14program1 { // Server 

	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			// socket = new Socket("localhost", 9999); computer = server ... 127.0.0
			listener = new ServerSocket( 9999 ); // Server port num 
			System.out.println("wating for connection ...");	
			
			socket = listener.accept();
			System.out.println("Conneted!");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while ( true ) {
				String inputMessage = in.readLine();
				
				if ( inputMessage.equalsIgnoreCase("bye") ) {
					System.out.println("Connection terminated!");
					break;
				}
				
				System.out.println("Client : " + inputMessage);
				System.out.println("Server >> ");
				
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + '\n');
				out.flush(); // flush the buffer 
			}	
		} catch ( IOException e ) {
			System.out.println("An error occurred while communicating with the client");
		}

	}

}
