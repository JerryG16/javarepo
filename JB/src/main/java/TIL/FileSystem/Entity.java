package TIL.FileSystem;

import java.util.Date;

public abstract class Entity {
	private String name;
	private long createdate;
	private int size;
	private Folder parent;
	
	public Entity(String name, Folder parent)
	{
		this.name=name;
		this.parent=parent;
		this.createdate=System.currentTimeMillis();
	
	}
	
	public String getName()
	{
		return name;
	}
	public boolean delete() {
		return this.parent.deleteEntry(this);
	}
	public String getPath() {
		if(parent==null) {
			return name;
		}
		return this.parent.getPath()+"/"+name;
	}
	public long getCreateDate()
	{
		return createdate;
	}
	public Entity getParent()
	{
		return parent;
	}
	public int getSize()
	{
		return size;
	}
}
