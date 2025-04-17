package day4;

import java.util.Scanner;

abstract class Animal {
	private String species;
	private int age;

	Animal(String species, int age) {
		this.species = species;
		this.age = age;

	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract String toString();

}

class Mammel extends Animal {
	private String color;

	Mammel(String species, int age, String color) {
		super(species, age);
		this.color = color;

	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Species: " + getSpecies() + "Color: " + getcolor();
	}

}

public class Mainanimal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Species of mammel: ");
		String species = scanner.nextLine();

		System.out.println("Enter age of mammal: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter color of mammel: ");
		String color = scanner.nextLine();
		Mammel mammel = new Mammel(species, age, color);
		System.out.println(mammel);
		scanner.close();

	}

}
