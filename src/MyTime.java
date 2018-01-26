import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public abstract class MyTime {
	public abstract void display();
	public static String getTime() {
		String t = "";
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		t = dateFormat.format(cal.getTime());
		return t;
		
	}
	public static String getDate() {
		String d ="";
		DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		Calendar cal = Calendar.getInstance();
		d = dateFormat.format(cal.getTime());
		return d;
		
	}
	
}
