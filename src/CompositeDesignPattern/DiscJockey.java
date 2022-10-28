package CompositeDesignPattern;

public class DiscJockey {

	SongComponent songComponent;

	public DiscJockey(SongComponent songComponent) {
		this.songComponent = songComponent;
	}
	
	public void getSongList() {
		songComponent.displaySongInfo();
	}
}
