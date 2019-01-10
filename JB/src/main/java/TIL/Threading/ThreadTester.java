package TIL.Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTester {
	
	public static void main(String args[])
	{
		int[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int coreCount = Runtime.getRuntime().availableProcessors();
		// Create Pool
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		Future<Integer> f1 = service.submit(new SecondTask(0,4,ar));
		Future<Integer> f2 = service.submit(new SecondTask(5,9,ar));
		Future<Integer> f3 = service.submit(new SecondTask(10,14,ar));
		
		try {
			Integer result1 = f1.get();
			Integer result2 = f2.get();
			Integer result3 = f3.get();
			int sum = result1 + result2 + result3;
			System.out.println(Thread.currentThread().getName() + " " +
					result1+result2+result3 + " = " + sum);
			System.out.println("Core Count ::: "+coreCount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*new Thread(new FirstTask(0,4,ar)).start();
		new Thread(new FirstTask(5,9,ar)).start();
		new Thread(new FirstTask(10,14,ar)).start();*/
	
	}
}	
