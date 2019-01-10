package TIL.datastructures;

public class StackOfStrings {
	private String[] s;
	private int n = 0;
	private int capacity;
	public StackOfStrings(int capacity)
	{
		this.capacity = capacity;
		s = new String[capacity];
	}
	
	public void push(String item)
	{
		s[n++] = item;
		
	}
	
	public String pop()
	{
		if(!isEmpty())
		{
			String item = s[--n];
			s[n] = null;
			return item;
		}
		return null;
	}
	public boolean isEmpty()
	{
		return false;
	}
}
