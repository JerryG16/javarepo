package TIL.JB;

public class binary {
	public static void main(String args[])
	{
		int[] a = {1,2,3,4,5};
		int l=0;
		int r=5;
		int x = 23;
		boolean flag = false;
		while(l<r)
		{
			int mid = (l+r)/2;
			if(a[mid] == x)
			{
				System.out.println(x);
				flag = true;
				break;
			}
			if(a[mid] < x)
				l = mid+1;
			else
				r = mid-1;
		}
		if(!flag)
			System.out.println("NOT FOUND");
	}
}
