package CompositeDesignPattern;

public abstract class SongComponent {

	public void add(SongComponent newSongComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(SongComponent newSongComponent) {
		throw new UnsupportedOperationException();
	}

	public SongComponent get(int componentIndex) {
		throw new UnsupportedOperationException();
	}

	public String getSongName() {
		throw new UnsupportedOperationException();
	}

	public String getBandName() {
		throw new UnsupportedOperationException();
	}

	public void displaySongInfo() {
		throw new UnsupportedOperationException();
	}
}
