package StrategyPattern;

public class Cats extends Animals {

	/**
	 * 
	 */
	public Cats() {
		super();
		flyingType = new CantFly();
	}

}
