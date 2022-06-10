import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Chap14Program6 extends JFrame { // Client Program using GUI & Thread 
	
	private JTextField startTf = new JTextField(7);
	private JTextField operatorTf = new JTextField(3);
	private JTextField endTf = new JTextField(7);
	private JTextField resTf = new JTextField(7);
	private JButton calcBtn = new JButton("계산");
	
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	
	public Chap14Program6() {
		super("Calculator Client");
		setSize(410, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // 쭈르륵 배열 
		c.add(startTf);
		c.add(operatorTf);
		c.add(endTf);
		c.add(new JLabel(" = "));
		c.add(resTf);
		c.add(calcBtn);
		
		setVisible(true);
	
		setupConnection();
		
		calcBtn.addActionListener(new ActionListener() { // 계산 버튼 눌렀을 때 처리 

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String startText = startTf.getText().trim(); // trim -> 공백 제거 
					String operatorText = operatorTf.getText().trim();
					String endText = endTf.getText().trim();					
					
					if(startText.length() == 0 || operatorText.length() == 0 || endText.length() == 0)
						return; // 하나라도 입력되지 않으면 return 
					
					out.write(startText+"\n");
					out.write(operatorText+"\n");
					out.write(endText+"\n");
					out.flush();
					
					String result = in.readLine(); // Server 측의 연산 결과 받아오기 
					resTf.setText(result);
					
				} catch (IOException e) {
					System.out.println("Client : disconnect from server");
					return;
				}
				
			}
			
		});
	}
	
	public void setupConnection() {
		try {
			socket = new Socket("localhost", 1234); // 연결 
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Chap14Program6();
	}

}
