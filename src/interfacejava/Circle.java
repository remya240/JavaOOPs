package interfacejava;

public class Circle implements Shape1 {

	public void makeshape() {
		System.out.println("The shape is circle");
	}

	public static void main(String[] args) {
		Circle shape = new Circle();
		shape.makeshape();
	}

}

interface Shape1 {
	void makeshape();

}