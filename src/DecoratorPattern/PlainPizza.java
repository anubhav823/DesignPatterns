package DecoratorPattern;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin-crust Pizza";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
