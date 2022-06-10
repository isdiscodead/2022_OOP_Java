import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  Chap14Program1 Server Program
 *  @author isdiscodead
 *  @since 2022-06-08
 *  @version 0.0.1
 */

public class Chap14program1 { // Server 

	public static void main(String[] args) {
		ServerSocket listener = null; // TCP 서버, 클라이언트의 연결 요청을 기다리면서 요청이 오면 요청 수락 
		Socket socket = null; // 연결된 클라이언트와 통신
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
				String inputMessage = in.readLine(); // client 단의 입력 받아오기 
				
				if ( inputMessage.equalsIgnoreCase("bye") ) {
					System.out.println("Connection terminated!");
					break;
				}
				
				System.out.println("Client : " + inputMessage);
				
				System.out.println("Server >> ");
				String outputMessage = scanner.nextLine(); // 서버 측에서 출력할 메시지 input 
				out.write(outputMessage + '\n');
				out.flush(); // flush the buffer 
			}	
			
		} catch ( IOException e ) {
			System.out.println("An error occurred while communicating with the client");
			
		} finally { // 마지막에 다 닫아주기 
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) { System.out.println("An error occurred while communicating with the client."); }
		}

	}

}
