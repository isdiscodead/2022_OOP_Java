import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
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

}
