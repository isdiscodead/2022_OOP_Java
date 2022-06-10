import java.awt.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class Chap14Program5 extends JFrame { // ServerProgram using GUI & Thread 
	
	private JTextArea log = new JTextArea();
	
	public Chap14Program5() {
		super("Calculation Server"); // 창 생성 
		
		setSize(500, 300);
		Container c = getContentPane();
		c.add(new JLabel("This is calculation server"));
		c.add(new JScrollPane(log), BorderLayout.CENTER);
		
		setVisible(true);
		new ServerThread().start(); // Server는 Thread로 실행 
	}
	
	public class ServerThread extends Thread {
		
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			
			try {
				listener = new ServerSocket(1234);
				while(true) {
					socket = listener.accept(); // 연결 수락 
					log.append("Client connected... \n");
					new ServiceThread(socket).start();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try { // 다 닫아주기 
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class ServiceThread extends Thread {
		
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		
		public ServiceThread(Socket socket) {
			this.socket = socket; // 소켓은 생성 시 매개변수로 받아옴 
			
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		public void run() {
			while(true) {
				try {
					String first = in.readLine();
					String operator = in.readLine();
					String second = in.readLine();
					int a = Integer.parseInt(first);
					int b = Integer.parseInt(second);
					
					String resText = "";
					int res = 0;
					
					switch(operator) { // 연산자에 따라 연산 
						case "+" : res = a + b; resText = Integer.toString(res); break;
						case "-" : res = a - b; resText = Integer.toString(res); break;
						case "*" : res = a * b; resText = Integer.toString(res); break;
						case "/" : 
							if(b == 0) resText = "Cannot divided by zero!";
							else {
								res = a / b;
								resText = Integer.toString(res); 
							}
							break;
						default:
							resText = "Wrong input";
					}
					
					out.write(resText+"\n"); // result를 버퍼에 입력 
					out.flush();
					
					log.append(first + operator + second + "=" + resText + "\n"); // Log 남기기 
					
				} catch (IOException e) {
					log.append("Connection terminated! \n");
					System.out.println("Connection terminated!");
					return;
				}

			}
		}
	}
	
	public static void main(String[] args) {
		new Chap14Program5();
	}

}
