import javax.swing.JLabel;

public class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; // connect label
	}
	
	@Override
	public void run() {
		int n = 0;
		while ( true ) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1000 밀리초 = 1초 
			} catch ( InterruptedException e ) {
				return;
			}
		}
	}
	
	// 일반 클래스이므로 다양한 method overriding 선택 가능 ... 
}	
