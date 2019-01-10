package TIL.Threading;

import java.util.concurrent.Callable;

public class SecondTask implements Callable<Integer>{
	int [] data;
	int sindex;
	int eindex;
	public SecondTask(int x , int y , int a[])
	{
		sindex = x;
		eindex = y;
		data = a;
	}
	public Integer call() throws Exception {
		int sum = 0;
		try {
			
			for(int i = sindex ; i < eindex ; i++)
			{
				sum+=data[i];
			}
			System.out.println(Thread.currentThread().getId() + " - " + sindex + 
					" " + eindex + " " + sum);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return sum;
	}
}
