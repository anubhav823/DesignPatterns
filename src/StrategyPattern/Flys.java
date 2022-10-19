package StrategyPattern;

public interface Flys {
	String fly();
}
class ItFlys implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I believe I can fly";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly";
	}
	
}
