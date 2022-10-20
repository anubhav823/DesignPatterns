package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
			"t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z" };

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	static boolean firstThread = true;

	private Singleton() {

	}

	// adding synchronized to method is not recommended as it waits every thread to
	// wait its turn and causes the program to slow down dramatically
	public static Singleton getInstance() {
		if (firstInstance == null) {
			// lazy instantiation
			if (firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized (Singleton.class) {// forces method to be a synchronized method until first object is created.
											// Then, it is no longer a synchronized method
				if (firstInstance == null) {
					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.letterList);
				}
			}
		}
		return firstInstance;
	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int numberOfTiles) {
		LinkedList<String> tilesToSend = new LinkedList<>();
		for (int i = 0; i < numberOfTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
}
