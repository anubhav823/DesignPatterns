package TemplateDesignPattern;

public class SandwichSculptor {
public static void main(String[] args) {
	Hoagie vegHoagie = new VeggieHoagie();
	vegHoagie.makeSandwich();
	
	Hoagie italianHoagie = new ItalianHoagie();
	italianHoagie.makeSandwich();
}
}
