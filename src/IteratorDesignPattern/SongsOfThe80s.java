package IteratorDesignPattern;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {

	SongInfo[] bestSongs;
	int arrayValue = 0;

	public SongsOfThe80s() {
		bestSongs = new SongInfo[3];
		addSong("Roam", "B52s", 1971);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head over heels", "Tears for Fears", 1985);
	}

	private void addSong(String songName, String artist, int year) {
		SongInfo songInfo = new SongInfo(songName, artist, year);
		bestSongs[arrayValue] = songInfo;
		arrayValue++;
	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(bestSongs).iterator();
	}

}
