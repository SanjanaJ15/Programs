import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<Double> 
{	
	@Override
	public Double call() throws Exception 
	{	
		Random r=new Random();
        double s= 0; 
        int loop= 1000;
        int max=10000;
        for (int i = 0; i < loop; i++)
        {
            int val = r.nextInt(max);
             s+=val; // sum of all random numbers
        }
        double average=s/loop;
        //System.out.println("Avg-"+average);
       return average;
	}
}