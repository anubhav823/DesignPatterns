package StrategyPattern;

public class Dog extends Animals {

	public Dog() {
		super();
		flyingType = new CantFly();
	}
}
