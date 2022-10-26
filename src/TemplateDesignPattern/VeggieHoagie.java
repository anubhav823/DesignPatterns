package TemplateDesignPattern;

public class VeggieHoagie extends Hoagie {

	@Override
	boolean customerWantsCheese() {
		return false;
	}

	@Override
	boolean customerWantsMeat() {
		return false;
	}

	@Override
	protected void addCheese() {
	}

	@Override
	protected void addVegetables() {
		System.out.println("adding vegetables");
	}

	@Override
	protected void addMeat() {
	}

}
