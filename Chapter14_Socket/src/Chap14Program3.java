import java.io.*;
import java.net.*;
import java.util.*;

public class Chap14Program3 { // Server Program 
	// 서버 프로그램 실행 후 client 실행 ...
	// server는 닫히면 안 됨 !! 
	 
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " "); // StringTokenizer -> 지정한 구분자로 쪼개줌 
		
		if (st.countTokens() != 3) return "error";

		String res="";
		
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		
		switch (opcode) {
			case "+": res = Integer.toString(op1 + op2);
				break;
			case "-": res = Integer.toString(op1 - op2);
				break;
			case "*": res = Integer.toString(op1 * op2);
				break;
			default : res = "error";
		}
		
		return res;
	}

	
	public static void main(String[] args) {

		ServerSocket listener = null; // TCP 서버, 클라이언트의 연결 요청을 기다리면서 요청이 오면 요청 수락 
		Socket socket = null; // 연결된 클라이언트와 통신
		
		try {
			listener = new ServerSocket(9999); // port 9999
			System.out.println("Waiting...");			
			socket = listener.accept(); // 클라이언트와 연결 
			System.out.println("Complete connection!");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String inputMessage = in.readLine(); // client 단에서 입력 받아옴 
				
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Connection terminated!"); 
					break;
				}
				
				System.out.println(inputMessage); 
				String res = calc(inputMessage); // 계산
				out.write(res + "\n"); // 계산 결과를 버퍼에 입력 
				out.flush();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} finally { // 마지막에 다 닫아주기 
			try {
				if(socket != null) socket.close();
				if(listener != null) listener.close();
				
			} catch (IOException e) {
				System.out.println("An error occurred while communicating with the client.");
			}
		}
	}
}