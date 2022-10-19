package StrategyPattern;

public class Animals {

	protected Flys flyingType;

	public Flys getFlyingType() {
		return flyingType;
	}

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	public String tryToFly() {
		return flyingType.fly();	
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
