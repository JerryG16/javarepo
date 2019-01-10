package TIL.JB;

public class bubble {
	public static void main(String args[])
	{
		int[] a = {1,3,2,5,4,10,9,7,8,6};
		int size = 10;
		for(int i=0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size-i-1 ; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int item:a)
		{
			System.out.print(item + " ");
		}
	}	
		
}
