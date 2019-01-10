package TIL.FileSystem;

import java.util.ArrayList;

public class File extends Entity
{
	private String content;
	private int size;
	public File(String name, Folder parent,int size)
	{
		super(name,parent);
		// this.size=size;
	}
	public int size()
	{
		return size;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content=content;
	}
}
