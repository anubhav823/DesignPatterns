package IteratorDesignPattern;

import java.util.Iterator;

public class DiscJockey {

	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;

	SongIterator iterator70s;
	SongIterator iterator80s;
	SongIterator iterator90s;

	public DiscJockey(SongIterator iterator70s, SongIterator iterator80s, SongIterator iterator90s) {
		this.iterator70s = iterator70s;
		this.iterator80s = iterator80s;
		this.iterator90s = iterator90s;
	}

	public void showTheSongs() {
		Iterator song70s = iterator70s.createIterator();
		Iterator song80s = iterator80s.createIterator();
		Iterator song90s = iterator90s.createIterator();

		System.out.println("Songs of the 70s========");
		printTheSongs(song70s);

		System.out.println("Songs of the 80s========");
		printTheSongs(song80s);

		System.out.println("Songs of the 90s========");
		printTheSongs(song90s);
	}

	private void printTheSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			SongInfo info = (SongInfo) iterator.next();
			System.out.println(info.getSongName()+" "+info.getBandName()+" "+info.getYearReleased());
		}
	}

}
