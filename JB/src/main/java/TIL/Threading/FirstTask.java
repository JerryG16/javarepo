package TIL.Threading;

public class FirstTask implements Runnable{
	int [] data;
	int sindex;
	int eindex;
	public FirstTask(int x , int y , int a[])
	{
		sindex = x;
		eindex = y;
		data = a;
	}
	public void run()
	{
		try {
			int sum = 0;
			for(int i = sindex ; i < eindex ; i++)
			{
				sum+=data[i];
			}
			System.out.println(Thread.currentThread().getId() + " " + sindex + 
					" " + eindex + " " + sum);
		}catch(Exception e)
		{
			
		}	
	}
}
