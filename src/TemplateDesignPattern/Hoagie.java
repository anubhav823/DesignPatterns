package TemplateDesignPattern;

public abstract class Hoagie {
	final void makeSandwich() {
		cutBun();
		if (customerWantsMeat()) {
			addMeat();
		}
		if (customerWantsCheese()) {
			addCheese();
		}
		if (customerWantsVeggie()) {
			addVegetables();
		}
		
		wrapTheHoagie();
	}

	public void cutBun() {
		System.out.println("Hoagie is cut");
	}
	
	public void wrapTheHoagie() {
		System.out.println("Wrap the hoagie");
	}
	// must be overridden
	protected abstract void addCheese();

	protected abstract void addVegetables();

	protected abstract void addMeat();

	// hook-totally optional
	boolean customerWantsMeat() {
		return true;
	}

	boolean customerWantsCheese() {
		return true;
	}

	boolean customerWantsVeggie() {
		return true;
	}

}
