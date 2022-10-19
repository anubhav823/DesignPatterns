package StrategyPattern;

public class AnimalPlay {
	public static void main(String[] args) {
		Animals sparky = new Dog();
		Animals tom = new Cats();
		Animals tweety = new Birds();

		System.out.println("Dog " + sparky.tryToFly());
		System.out.println("Cat " + tom.tryToFly());
		System.out.println("Bird " + tweety.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog " + sparky.tryToFly());
		
	}
}
