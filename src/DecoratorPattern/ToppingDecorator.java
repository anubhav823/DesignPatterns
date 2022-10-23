package DecoratorPattern;

public class ToppingDecorator implements Pizza{

	Pizza plainPizza;

	/**
	 * 
	 */
	public ToppingDecorator(Pizza newPizza) {
		this.plainPizza = newPizza;
	}

	public String getDescription() {
		return plainPizza.getDescription();	
	}

	public double getCost() {
		return plainPizza.getCost();
	}

}
