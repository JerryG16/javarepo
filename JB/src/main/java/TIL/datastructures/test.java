package TIL.datastructures;

import java.io.*;
import java.util.*;
import java.lang.*;

public class test 
{
		public static void main(String args[])
		{
			Playlist playlist = new Playlist();
			ArrayList<Song> songs = playlist.getSongFromFile();
			Collections.sort(songs);
			System.out.println(songs);
		}
}
