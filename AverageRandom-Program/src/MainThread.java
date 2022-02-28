

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MainThread {

	public static void main(String[] args) throws Exception 
	{
		double sum,average;
		MyThread call1 = new MyThread();
		MyThread call2 = new MyThread();
		MyThread call3 = new MyThread();
		MyThread call4 = new MyThread();
		MyThread call5 = new MyThread();
		MyThread call6 = new MyThread();
		MyThread call7 = new MyThread();
		MyThread call8 = new MyThread();
		MyThread call9 = new MyThread();
		MyThread call10 = new MyThread();
		
		
		FutureTask<Double> Task1 = new FutureTask<Double>(call1);
		FutureTask<Double> Task2 = new FutureTask<Double>(call2);
		FutureTask<Double> Task3 = new FutureTask<Double>(call3);
		FutureTask<Double> Task4 = new FutureTask<Double>(call4);
		FutureTask<Double> Task5 = new FutureTask<Double>(call5);
		FutureTask<Double> Task6 = new FutureTask<Double>(call6);
		FutureTask<Double> Task7 = new FutureTask<Double>(call7);
		FutureTask<Double> Task8 = new FutureTask<Double>(call8);
		FutureTask<Double> Task9 = new FutureTask<Double>(call9);
		FutureTask<Double> Task10 = new FutureTask<Double>(call10);

		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(Task1);
		executor.execute(Task2);
		executor.execute(Task3);
		executor.execute(Task4);
		executor.execute(Task5);
		executor.execute(Task6);
		executor.execute(Task7);
		executor.execute(Task8);
		executor.execute(Task9);
		executor.execute(Task10);
		
		while (true) 
		{
			try {
				if(Task1.isDone() && Task2.isDone()&& Task3.isDone()&& Task4.isDone() && Task5.isDone()&& Task6.isDone()&& Task7.isDone() && Task8.isDone()&& Task9.isDone()&& Task10.isDone())
				{
					System.out.println("All 10 Threads are Done");
					sum=Task1.get()+Task2.get()+Task3.get()+Task4.get()+Task5.get()+Task6.get()+Task7.get()+Task8.get()+Task9.get()+Task10.get();
					average=sum/10; 
					System.out.println("Average of 10K random numbers is\n"+average);
					executor.shutdown();
					return;
				}
			} 
			catch (InterruptedException | ExecutionException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
