import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock1 extends MyTime implements NewInterface{
	public static void main(String[] args) {
		final DigitalClock1 dc1 = new DigitalClock1();
		Timer clock = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				dc1.display();
			}
			
		};
		dc1.display();
		clock.scheduleAtFixedRate(tt, 1000, 1000);
	}
	
	@Override
	public void display() {
		String dt = MyTime.getDate();
		String tm = MyTime.getTime();
		String time = dt+"-"+tm;
		System.out.println(time);
	}
	
	@Override
	public void first() {
		throw new UnsupportedOperationException("Not supported yet");
		
		
	}
	
	@Override
	public String second(int x) {
		throw new UnsupportedOperationException("Not supported yet");
		
	}
	
}
