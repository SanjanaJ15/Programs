import java.util.Timer;

public class SchedulerCall {
	public static void main(String[] args) {
		Timer t=new Timer();
		SchedulerTask task=new SchedulerTask();
		t.scheduleAtFixedRate(task,0,15000);
	}

}
