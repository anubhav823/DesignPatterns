package FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EnemyShipFactory factory = new EnemyShipFactory();
		String userInput = sc.nextLine();
		EnemyShip ship = factory.makeEnemyShip(userInput);
		doStuffEnemy(ship);
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followEnemyShip();
		enemyShip.doDamage();
	}
}
