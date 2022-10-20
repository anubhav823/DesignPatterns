package Singleton;

import java.util.LinkedList;

public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println("Id: " + System.identityHashCode(instance));
		System.out.println(instance.getLetterList());

		LinkedList<String> playerOne = instance.getTiles(7);
		System.out.println(playerOne);
		LinkedList<String> playerTwo = instance.getTiles(7);
		System.out.println(playerTwo);

		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Id: " + System.identityHashCode(instanceTwo));

	}
}
