package PrototypePattern;

public class TestCloning {
	public static void main(String[] args) {
		CloneFactory animalFactory = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSheep = (Sheep) animalFactory.getClone(sally);
		System.out.println(sally);
		System.out.println(clonedSheep);
		
		System.out.println("Sally "+System.identityHashCode(sally));
		System.out.println("ClonedSheep "+System.identityHashCode(clonedSheep));
	}
}
