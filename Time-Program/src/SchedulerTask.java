import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class SchedulerTask extends TimerTask 
{
	Date date;	
	@Override
	public void run() {
		date=new Date();
		SimpleDateFormat display=new SimpleDateFormat("hh:mm:ss");
		System.out.println("Current Time is-"+display.format(date));
	}
	}
 