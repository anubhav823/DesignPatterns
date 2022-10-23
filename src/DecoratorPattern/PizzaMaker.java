package DecoratorPattern;

public class PizzaMaker {
	public static void main(String[] args) {
		Pizza pizza = new Mozarella(new PlainPizza());
		System.out.println("pizza "+pizza.getDescription());
		System.out.println("pizza cost "+pizza.getCost());
	}
}
