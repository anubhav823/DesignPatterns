package StrategyPattern;

public class Birds extends Animals {

	/**
	 * 
	 */
	public Birds() {
		super();
		flyingType = new ItFlys();
	}

}