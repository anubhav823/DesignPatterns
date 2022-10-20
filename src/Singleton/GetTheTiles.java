package Singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Id: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		System.out.println("Player: " + playerOneTiles);
	}

}
