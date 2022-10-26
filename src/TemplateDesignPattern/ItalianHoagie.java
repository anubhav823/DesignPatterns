package TemplateDesignPattern;

public class ItalianHoagie extends Hoagie {

	@Override
	protected void addCheese() {
		System.out.println("adding cheese");
	}

	@Override
	protected void addVegetables() {
		System.out.println("adding vegetables");
	}

	@Override
	protected void addMeat() {
		System.out.println("adding meat");
	}

}
