package TIL.datastructures;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Playlist 
{
	private static final String FILE_LOCATION = "E:/Java Lecture/song.txt";
	
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public ArrayList<Song> getSongFromFile()
	{
		File file = new File(FILE_LOCATION);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null)
			{
				String[] tokens = line.trim().split("#");
				Song song = new Song();
				song.setTitle(tokens[0].trim());
				song.setSinger(tokens[1].trim());
				song.setMovie(tokens[2].trim());
				song.setBps(tokens[3].trim());
				song.setDuration(tokens[4].trim());
				
				songs.add(song);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return songs;
	}
	
}
