package dto;

public class Gakkyoku {

	private String artist_id;
	private int id;
	private String outline;
	private String title;
	
	public Gakkyoku(){
	}

	public Gakkyoku(String artist_id,int id,String outline,String title){
		this.artist_id = artist_id;
		this.id = id;
		this.outline = outline;
		this.title = title;
	}
	
	public String getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
