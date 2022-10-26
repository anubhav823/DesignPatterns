package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator {

	List<SongInfo> bestSongs;

	public SongsOfThe70s() {
		bestSongs = new ArrayList<>();
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I will survive", "Gloria Gaynar", 1979);
	}

	private void addSong(String songName, String artist, int year) {
		SongInfo songInfo = new SongInfo(songName, artist, year);
		bestSongs.add(songInfo);
	}

	@Override
	public Iterator createIterator() {
		return bestSongs.iterator();
	}

}
