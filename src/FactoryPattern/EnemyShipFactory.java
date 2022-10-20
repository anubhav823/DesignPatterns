package FactoryPattern;

public class EnemyShipFactory {

	protected EnemyShip makeEnemyShip(String shipType) {
		EnemyShip ship = null;
		switch (shipType) {
		case "U": {
			return new UFOEnemyShip();
		}
		case "R": {
			return new RocketEnemyShip();
		}
		case "B": {
			return new BossUFOEnemyShip();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + shipType);
		}
 	}
}
