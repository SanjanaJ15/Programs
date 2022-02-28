import java.text.SimpleDateFormat;
import java.util.Date;

public class Display 
{
	
	public static void main(String[] args) {
		Date d=new Date();
	SimpleDateFormat timedisplay=new SimpleDateFormat("hh:mm:ss");
	System.out.println("Time is-"+timedisplay.format(d));
}
}