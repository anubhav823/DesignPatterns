package StrategyPattern;

public interface Flys {
	String fly();
}

class ItFlys implements Flys {

	@Override
	public String fly() {
		return "I believe I can fly";
	}

}

class CantFly implements Flys {

	@Override
	public String fly() {
		return "I can't fly";
	}

}
