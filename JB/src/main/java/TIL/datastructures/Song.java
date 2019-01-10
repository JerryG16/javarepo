package TIL.datastructures;

public class Song implements Comparable<Song>{
	private String title;
	private String singer;
	private String movie;
	private String bps;
	private String duration;
	
	public int compareTo(Song s)
	{
		return this.title.compareTo(s.getTitle());
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getBps() {
		return bps;
	}
	public void setBps(String bps) {
		this.bps = bps;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", movie=" + movie + ", bps=" + bps + ", duration="
				+ duration + "]";
	}
}
