package TIL.FileSystem;

import java.util.ArrayList;

public class Folder extends Entity{

	ArrayList<Entity>entityList;
	public Folder(String name, Folder parent)
	{
		super(name,parent);
		entityList = new ArrayList<Entity>();
	}
	public boolean deleteEntry(Entity e) {
		return entityList.remove(e);
	}
	
	public int size() 
	{
		int size=0;
		for(Entity e: entityList) 
		{
			size=size+e.getSize();
		}
		return size;
	}
}
