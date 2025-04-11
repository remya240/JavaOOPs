package interfacejava;

interface AnimalDog {
	void makesound();

	void eatfood();
}

interface AnimalCow {
	void cowmakesound();

	void coweatfood();

}

class Dog implements AnimalDog {
	@Override
	public void makesound() {
		System.out.println("Dog barks!");
	}

	@Override
	public void eatfood() {
		System.out.println("Dog Eats bone");
	}

}

class Cow implements AnimalCow {
	@Override
	public void cowmakesound() {
		System.out.println("Cow moo!");
	}

	@Override
	public void coweatfood() {
		System.out.println("Cow eats grass.");
	}

}

public class MainAnimal {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cow cow = new Cow();
		dog.makesound();
		dog.eatfood();
		cow.cowmakesound();
		cow.coweatfood();

	}

}