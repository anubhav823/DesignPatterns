package PrototypePattern;

public class Sheep implements Animal{

	public Sheep() {
		System.out.println("Made sheep");
	}
	@Override
	public Animal makeCopy() {
		System.out.println("Cloning a sheep");
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheep;
	}
	@Override
	public String toString() {
		return "Sheep toString";
	}
	
	

}
