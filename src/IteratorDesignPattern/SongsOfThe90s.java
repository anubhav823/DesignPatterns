package IteratorDesignPattern;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{

	Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();
	int hashKey = 0;

	public SongsOfThe90s() {
		addSong("Creep", "B52s", 1991);
		addSong("Never Summer", "Bananarama", 1994);
		addSong("Walk over heels", "Fears", 1995);
	}

	private void addSong(String songName, String artist, int year) {
		SongInfo songInfo = new SongInfo(songName, artist, year);
		bestSongs.put(hashKey, songInfo);
		hashKey++;
	}

	@Override
	public Iterator createIterator() {
		return bestSongs.values().iterator();
	}
}
