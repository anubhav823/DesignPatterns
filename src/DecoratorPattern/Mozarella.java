package DecoratorPattern;

public class Mozarella extends ToppingDecorator {

	public Mozarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding some mozarella");
	}

	public String getDescription() {
		return plainPizza.getDescription() + ", mozarella";
	}

	public double getCost() {
		return plainPizza.getCost() + 0.50;
	}
}
